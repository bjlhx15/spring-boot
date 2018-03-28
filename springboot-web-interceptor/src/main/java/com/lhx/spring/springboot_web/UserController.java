package com.lhx.spring.springboot_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@GetMapping(value = "/user/home")
	@ResponseBody
	public String home() {
		System.out.println("--------user home--------");
		return "user home";
	}	
	@GetMapping(value = "/user/help")
	@ResponseBody
	public String help() {
		throw new IllegalArgumentException("args is empty");
	}	
}
