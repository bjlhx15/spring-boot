package com.lhx.mall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lhx.mall.product.bean.Product;
import com.lhx.mall.product.mapper.ProductMapper;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		ProductMapper productMapper = context.getBean(ProductMapper.class);
		Product product = new Product();
		product.setPname("测试");
		product.setType("1");
		product.setPrice(38d);
		// product.setCreateTime(new Date());
		productMapper.addProduct(product);
		System.out.println("Hello World!");
		// context.close();
	}
}
