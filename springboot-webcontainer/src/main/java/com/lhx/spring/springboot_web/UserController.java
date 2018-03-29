package com.lhx.spring.springboot_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("show")
	public String show() {
		return "show";
	}
}
