package com.lhx.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App2 {
	@Bean
	public Runnable createRunnable() {
		return () -> {
			System.out.println("spring boot is running");
		};
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
		context.getBean(Runnable.class).run();
		System.out.println(context.getBean(User.class));
	}
}
