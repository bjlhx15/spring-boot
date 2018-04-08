package com.lhx.mall.web.mall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lhx.mall.web.mall.bean.Product;
import com.lhx.mall.web.mall.bean.Response;

public class Client {
	public static void main(String[] args) throws Exception {

		CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", new RetryOneTime(1000));
		client.start();
		client.blockUntilConnected();

		ServiceDiscovery<Object> discovery = ServiceDiscoveryBuilder.builder(Object.class).client(client)
				.basePath("/soa").build();

		Collection<ServiceInstance<Object>> instances = discovery.queryForInstances("product");
		List<String> services = new ArrayList<>();
		instances.forEach((item) -> {
			System.out.println(item.getAddress());
			System.out.println(item.getPort());
			services.add(item.getAddress() + ":" + item.getPort());
		});

		LoadBalance lb = new LoadBalance(services);
		for (int i = 0; i < 10; i++) {
			RestTemplate rt = new RestTemplate();
			String string = rt.getForObject("http://" + lb.choose() + "/soa/address", String.class);
			System.out.println(string);
//			Response<Product> fromJson = new Gson().fromJson(string, new TypeToken<Response<Product>>() {
//			}.getType());
//
//			System.out.println(new Gson().toJson(fromJson));
		}

	}
}
