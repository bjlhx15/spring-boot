package com.lhx.spring.springboot_enableauto_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

	@Bean
	public User createUser() {
		return new User();
	}
}
