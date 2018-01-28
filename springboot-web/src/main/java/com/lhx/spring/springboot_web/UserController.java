package com.lhx.spring.springboot_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping(value = "/user/home", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		return "user home";
	}

	@GetMapping(value = "/user/show")
	@ResponseBody
	public String show() {
		return "user show";
	}

	@PostMapping(value = "/user/create")
	@ResponseBody
	public String create() {
		return "user create";
	}
}
