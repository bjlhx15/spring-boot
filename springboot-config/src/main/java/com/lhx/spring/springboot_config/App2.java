package com.lhx.spring.springboot_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.session.SessionProperties.Jdbc;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
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

		context.getBean(JdbcConfig.class).show();
		System.out.println(context.getEnvironment().getProperty("jdbc.name"));
		context.close();
	}
}
