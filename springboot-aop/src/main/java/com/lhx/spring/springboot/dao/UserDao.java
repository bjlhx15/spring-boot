package com.lhx.spring.springboot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void add(String username, String password) {
		System.out.println("add username=" + username + ",password=" + password);
	}
}
