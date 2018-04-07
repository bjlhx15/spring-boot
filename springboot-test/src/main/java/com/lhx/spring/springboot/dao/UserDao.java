package com.lhx.spring.springboot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public Integer addUser(String username) {
		System.out.println("user dao adduser [username="+username+"]");
		if(username==null) {
			return 0;
		}
		return 1;
	}
}
