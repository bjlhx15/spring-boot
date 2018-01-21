package com.lhx.spring.kuozhan;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	private ApplicationContext applicationContext;
	//spring 4.3 提供,与构造方法调用有关
	public Bank(ApplicationContext applicationContext) {
		this.applicationContext=applicationContext;
	}
	public void show() {
		System.out.println("book:"+applicationContext.getClass());
	}
}
