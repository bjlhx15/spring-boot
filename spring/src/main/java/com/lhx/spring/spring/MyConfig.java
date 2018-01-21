package com.lhx.spring.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	@Bean(name="myBean")
	@Scope("prototype")
	public MyBean createMyBean() {
		return new MyBean();
	}
	

	@Bean()
	public RunnableFactoryBean createRunnableFactoryBean() {
		return new RunnableFactoryBean();
	}
	
	@Bean
	public CarFactory createCarFactory() {
		return new CarFactory();
	}
	
	@Bean
	public Car createCar(CarFactory factory) {
		return factory.create();
	}
	
	@Bean
	public Cat createCat() {
		return new Cat();
	}
	@Bean
	public Animal createAnimal() {
		return new Animal();
	}
	@Bean
	@Primary
	public UserDao createUserDao() {
		return new UserDao();
	}
}
