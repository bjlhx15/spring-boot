package com.lhx.spring.springboot_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
	@GetMapping(value = "/role/show")
	public String show() {
		return "user show";
	}
}
