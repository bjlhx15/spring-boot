package com.lhx.spring.springboot_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addProdcut(String value) {
		String sql = "insert into product(pname) values('" + value + "')";
		jdbcTemplate.execute(sql);
	}
}
