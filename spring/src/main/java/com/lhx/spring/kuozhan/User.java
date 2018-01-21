package com.lhx.spring.kuozhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class User {
	private ApplicationContext applicationContext;

	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		System.out.println("User Set属性");
	}

	public void init() {
		System.out.println("User init");

	}

	public void show() {
		System.out.println("User:" + applicationContext.getClass());
	}
}
