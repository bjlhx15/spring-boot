package com.lhx.spring.springboot;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App3 {
	@Bean
	public Runnable createRunnable() {
		return () -> {
			System.out.println("spring boot is running");
		};
	}

	public static void main(String[] args) {
		// SpringApplication app = new SpringApplication(App3.class);
		SpringApplication app = new SpringApplication();
		Set<Object> sets = new HashSet<>();
		sets.add(App3.class);
		app.setSources(sets);
		ConfigurableApplicationContext context = app.run(App3.class, args);
		context.getBean(Runnable.class).run();
		System.out.println(context.getBean(User.class));
	}
}
