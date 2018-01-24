package com.lhx.spring.springboot_event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		// ConfigurableApplicationContext context = SpringApplication.run(App.class,
		// args);
		
		SpringApplication app = new SpringApplication(App.class);
		//app.addListeners(new MyApplicationListener());
		ConfigurableApplicationContext context = app.run(args);
		context.publishEvent(new MyApplicationEvent(new Object()));
		context.stop();
//		context.close();
	}
}
