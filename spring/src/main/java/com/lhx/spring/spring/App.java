package com.lhx.spring.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				MyConfig.class,User.class,UserDao.class);
		System.out.println(annotationConfigApplicationContext.getBean(MyBean.class));
		// System.out.println(annotationConfigApplicationContext.getBean("createMyBean"));//默认是方法名
		System.out.println(annotationConfigApplicationContext.getBean("myBean"));// 指定具体名

		//System.out.println(annotationConfigApplicationContext.getBean(RunnableFactoryBean.class));
		System.out.println(annotationConfigApplicationContext.getBean(Jeep.class));
		System.out.println(annotationConfigApplicationContext.getBean("createRunnableFactoryBean"));
		System.out.println(annotationConfigApplicationContext.getBean(RunnableFactoryBean.class));//类型获取
		System.out.println(annotationConfigApplicationContext.getBean("&createRunnableFactoryBean"));//名称获取
		

		System.out.println(annotationConfigApplicationContext.getBean(Car.class));
		System.out.println(annotationConfigApplicationContext.getBean(Cat.class));
		System.out.println(annotationConfigApplicationContext.getBean(Dog.class));
		System.out.println(annotationConfigApplicationContext.getBean(Animal.class));
		System.out.println(annotationConfigApplicationContext.getBean(User.class));
//		System.out.println(annotationConfigApplicationContext.getBean("user"));
		System.out.println(annotationConfigApplicationContext.getBeansOfType(User.class));
		System.out.println("--------------------");
		User user = annotationConfigApplicationContext.getBean(User.class);
		System.out.println(user);

		annotationConfigApplicationContext.close();
	}
}
