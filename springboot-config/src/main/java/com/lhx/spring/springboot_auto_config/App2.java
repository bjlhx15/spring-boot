package com.lhx.spring.springboot_auto_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
		System.out.println(context.getBeansOfType(Runnable.class));
		context.close();
	}
}
