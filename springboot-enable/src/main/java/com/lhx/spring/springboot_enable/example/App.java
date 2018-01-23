package com.lhx.spring.springboot_enable.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;

@ComponentScan
@EnableEcho(packages = { "com.lhx.spring.springboot_enable.example.vo", "com.lhx.spring.springboot_enable.example.po" })
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println(context.getBeansOfType(Runnable.class));

		context.close();
	}
}
