package com.lhx.spring.springboot_web;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class App {
	private static DataSource dataSource;

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		dataSource = context.getBean(DataSource.class);
		System.out.println(dataSource.getClass());
		
		Connection connection = dataSource.getConnection();
		System.out.println(connection.getCatalog());

		System.out.println(context.getBean(DataSource.class));
		System.out.println(context.getBean(JdbcTemplate.class));

		//context.getBean(ProductDao.class).addProdcut("mp3");
		connection.close();
	}
}
