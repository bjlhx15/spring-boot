package com.lhx.spring.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {

	@Bean(initMethod = "init", destroyMethod = "destory")
	public Dog createDog() {
		return new Dog();
	}
}
