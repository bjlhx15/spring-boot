package com.lhx.spring.springboot_web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping(value = "/user/ip")
	@ResponseBody
	public String edit(HttpServletRequest req) {
		return "user edit " + req.getRemoteHost();
	}

	@GetMapping(value = "/user/{id}")
	@ResponseBody
	public String display(@PathVariable("id") String id) {
		return "user display,id=" + id;
	}

	@PostMapping(value = "/user/create")
	@ResponseBody
	public String create(@RequestParam(value = "username", defaultValue = "admin", required = false) String username,
			@RequestParam("password") String password) {
		return "user create,username=" + username + ";password=" + password;
	}
}
