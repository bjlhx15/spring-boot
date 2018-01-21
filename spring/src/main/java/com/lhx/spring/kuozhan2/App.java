package com.lhx.spring.kuozhan2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.lhx.spring.kuozhan2");
		System.out.println(context.getBean("person1"));
		context.getBeansOfType(Person.class).values().forEach(System.out::println);
		
		context.close();
	}
}
