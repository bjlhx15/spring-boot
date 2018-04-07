package com.lhx.spring.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhx.spring.springboot.dao.UserDao;

@RestController
public class BookController {
	@Autowired
	private UserDao userDao;
	@GetMapping("/book/home")
	public String home() {
		System.out.println("/book/home url is invode.");
		return "home";
	}

	@GetMapping("/book/show")
	public String show(String id) {
		System.out.println("/book/show url is invode.");
		userDao.addUser("");
		return "book" + id;
	}
}
