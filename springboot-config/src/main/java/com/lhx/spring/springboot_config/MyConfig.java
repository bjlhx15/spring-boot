package com.lhx.spring.springboot_config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootConfiguration
public class MyConfig {
	@Bean
	public Runnable createRunnable() {
		System.out.println("--------1--------");
		return ()->{};
	}

	@Bean
	@Profile("dev")
	public Runnable createRunnable2() {
		System.out.println("--------2--------");
		return ()->{};
	}

	@Bean
	@Profile("test")
	public Runnable createRunnable3() {
		System.out.println("--------3--------");
		return ()->{};
	}
}
