package com.lhx.spring.kuozhan;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.lhx.spring.kuozhan");
		System.out.println(context.getBean("user"));
//		System.out.println(context.getBean("createUser"));
//		User bean = (User) context.getBean("user");
//		bean.show();
//		
//		
//
//		Book bean2 = context.getBean(Book.class);
//		bean2.show();
//		
//
//		Bank bean3 = context.getBean(Bank.class);
//		bean3.show();
		
//		EchoBeanPostProcessor
		context.getBean(Dog.class).show();
		context.close();
	}
}
