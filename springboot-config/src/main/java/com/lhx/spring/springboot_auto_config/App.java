package com.lhx.spring.springboot_auto_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
public class App {
//	@Bean
//	public Runnable createRunnable() {
//		return () -> {
//			System.out.println("spring boot is running");
//		};
//	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
//		context.getBean(Runnable.class).run();
		//可以通过启动参数修改-Dfile.encoding=GBK
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(context.getBeansOfType(EncodingConvert.class));
		context.close();
	}
}
