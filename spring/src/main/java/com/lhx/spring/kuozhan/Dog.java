package com.lhx.spring.kuozhan;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dog implements SpringContextAware {

	private ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}


	public void show() {
		System.out.println("Dog:" + applicationContext.getClass());
	}
}
