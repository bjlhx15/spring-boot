package com.lhx.spring.springboot_enable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;

@ComponentScan
@EnableLog(name="my annon")
public class App4 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App4.class, args);
		System.out.println(context.getBean(User.class));
		System.out.println(context.getBean(Role.class));
		System.out.println(context.getBeansOfType(Runnable.class));
		
		context.close();
	}
}
