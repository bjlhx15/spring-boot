package com.lhx.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private CounterService counterService;

	@GetMapping("/user/home")
	public String home(@RequestParam("error") String error) {
		counterService.increment("user.home.request.count");
		if (error.equals("test")) {
			throw new NullPointerException();
		}
		return "home";
	}

	@Autowired
	private GaugeService gaugeService;

	@GetMapping("/user/create")
	public String create(int age) {
		gaugeService.submit("user.create.age", age);
		return "create";
	}
}
