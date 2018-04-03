package com.lhx.spring.springboot;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lhx.spring.redis.EnableRedis;

import redis.clients.jedis.Jedis;

//@EnableRedis
@SpringBootApplication
public class App {
	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		Jedis jedis = context.getBean(Jedis.class);
		jedis.set("id", "5555");
		System.out.println(jedis.get("id"));
		context.close();
	}
}
