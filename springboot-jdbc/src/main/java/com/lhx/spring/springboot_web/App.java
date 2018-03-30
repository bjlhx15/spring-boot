package com.lhx.spring.springboot_web;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
	private static DataSource dataSource;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		//System.out.println(context.getBean(DataSource.class));
		dataSource = context.getBean(DataSource.class);
	}
}
