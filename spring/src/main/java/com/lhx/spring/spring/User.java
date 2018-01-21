package com.lhx.spring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Autowired
	//@Qualifier("userDao")
	private UserDao userDao;
	@Override
	public String toString() {
		System.out.println(userDao);
		return super.toString();
	}
}
