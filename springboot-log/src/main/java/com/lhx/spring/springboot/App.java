package com.lhx.spring.springboot;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lhx.spring.springboot.dao.UserDao;
import com.lhx.spring.springboot.service.UserService;

@SpringBootApplication
public class App {
	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		context.getBean(UserDao.class).log();
		context.getBean(UserService.class).log();
		context.close();
	}
}
