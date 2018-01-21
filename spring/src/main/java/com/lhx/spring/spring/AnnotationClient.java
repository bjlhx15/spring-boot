package com.lhx.spring.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.lhx.spring.spring");
		System.out.println(context.getBean(Car.class));
		System.out.println(context.getBean(Cat.class));
		System.out.println(context.getBean(Dog.class));
		System.out.println(context.getBean(Animal.class));
		System.out.println(context.getBean(User.class));
		context.close();
	}
}
