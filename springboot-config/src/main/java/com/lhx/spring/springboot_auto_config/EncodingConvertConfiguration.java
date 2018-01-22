package com.lhx.spring.springboot_auto_config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
public class EncodingConvertConfiguration {
	@Bean
	@Conditional(GBKCondition.class)
	public EncodingConvert createGBKEncodingConvert() {
		return new GBKEncodingConvert();
	}

	@Bean
	@Conditional(UTF8Condition.class)
	public EncodingConvert createUTF8EncodingConvert() {
		return new UTF8EncodingConvert();
	}
}
