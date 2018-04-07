package com.lhx.spring.springboot.dao;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 只能测试环境下使用
 * 只能用@TestConfiguration 不能使用@Configuration
 *
 */
@TestConfiguration
public class TestBeanConfiguration {

	@Bean
	public Runnable createRunnable() {
		return ()->{};
	}
}
