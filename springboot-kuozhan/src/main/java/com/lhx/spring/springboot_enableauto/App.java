package com.lhx.spring.springboot_enableauto;

import java.awt.Dialog.ModalExclusionType;
import java.util.HashMap;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		// ConfigurableApplicationContext context = SpringApplication.run(App.class,
		// args);
		SpringApplication application = new SpringApplication(App.class);
		// application.addInitializers(new MyApplicationContextInitializer());
		//application.setBannerMode(Banner.Mode.OFF);
		
		HashMap<String, Object> defaultProperties = new HashMap<>();
		defaultProperties.put("server.host", "127.0.0.1");
		application.setDefaultProperties(defaultProperties);
		
		ConfigurableApplicationContext context = application.run(args);
		
		ApplicationArguments arguments = context.getBean(ApplicationArguments.class);
		System.out.println(arguments.getSourceArgs().length);
		System.out.println(arguments.getOptionNames());
		System.out.println(arguments.getOptionValues("name"));

		context.close();
	}
}
