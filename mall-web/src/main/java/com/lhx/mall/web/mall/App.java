package com.lhx.mall.web.mall;

import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lhx.mall.web.mall.bean.Product;
import com.lhx.mall.web.mall.bean.Response;

public class App {
	static String baseURL = "http://127.0.0.1:8080";

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();
		String string = rt.getForObject(baseURL + "/soa/product/1", String.class);
		System.out.println(string);
		Response<Product> fromJson = new Gson().fromJson(string, new TypeToken<Response<Product>>() {
		}.getType());

		System.out.println(new Gson().toJson(fromJson));
	}
}
