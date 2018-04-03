package com.lhx.spring.springboot_web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootConfiguration
public class DBConfiguration {

	@Autowired
	private Environment env;

	@Bean
	public DataSource createDataSource() {
		DruidDataSource source = new DruidDataSource();
		source.setUrl(env.getProperty("spring.datasource.url"));
		source.setUsername(env.getProperty("spring.datasource.username"));
		source.setPassword(env.getProperty("spring.datasource.password"));
		source.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
		return source;
	}
}
