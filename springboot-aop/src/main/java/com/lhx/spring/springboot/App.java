package com.lhx.spring.springboot;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.lhx.spring.springboot.dao.UserDao;

@SpringBootApplication
@EnableAspectJAutoProxy
public class App {
	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		context.getBean(UserDao.class).add("admin", "123");
		context.close();
	}
}
