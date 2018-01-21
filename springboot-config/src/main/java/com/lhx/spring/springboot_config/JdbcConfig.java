package com.lhx.spring.springboot_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfig {
	@Value("${url}")
	private String url;
	@Value("driverClassName")
	private String driverName;
	
	public void show() {
		System.out.println("url="+url);
		System.out.println("driverName="+driverName);
	}
}
