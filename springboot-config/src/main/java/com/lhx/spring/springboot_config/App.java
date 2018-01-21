package com.lhx.spring.springboot_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
	@Bean
	public Runnable createRunnable() {
		return () -> {
			System.out.println("spring boot is running");
		};
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		context.getBean(Runnable.class).run();
		System.out.println(context.getEnvironment().getProperty("local.ip"));
		UserConfig userConfig = context.getBean(UserConfig.class);
		userConfig.show();
		

		System.out.println(context.getEnvironment().getProperty("app.name"));
		

		System.out.println(context.getEnvironment().getProperty("jdbc.url"));
		
		context.close();
	}
}
