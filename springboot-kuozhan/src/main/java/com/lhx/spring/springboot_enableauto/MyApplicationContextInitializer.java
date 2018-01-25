package com.lhx.spring.springboot_enableauto;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("bean count:" + applicationContext.getBeanDefinitionCount());
		// ConfigurableListableBeanFactory factory =
		// applicationContext.getBeanFactory();
	}

}
