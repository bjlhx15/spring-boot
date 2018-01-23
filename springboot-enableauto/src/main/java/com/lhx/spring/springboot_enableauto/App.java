package com.lhx.spring.springboot_enableauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.lhx.spring.springboot_enableauto_example.Role;
import com.lhx.spring.springboot_enableauto_example.User;
import com.lhx.spring.springboot_enableauto_example.UserConfig;

//@SpringBootApplication
//@EnableAutoConfiguration(exclude=UserConfig.class)

@EnableAutoConfiguration
@ComponentScan
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println(context.getBean(Runnable.class));
		System.out.println(context.getBean(User.class));
		System.out.println(context.getBean(Role.class));
		System.out.println(context.getBean("gson"));
		context.close();
	}
}
