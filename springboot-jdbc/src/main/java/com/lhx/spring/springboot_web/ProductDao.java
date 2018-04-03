package com.lhx.spring.springboot_web;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Transactional
	public void addProdcut(String value) {
		String sql = "insert into product(pname) values('" + value + "')";
		jdbcTemplate.execute(sql);
	}

	@Transactional(noRollbackFor=NullPointerException.class)
	public void addProdcutBatch(String... names) throws Exception {
		for (String name : names) {
			String sql = "insert into product(pname) values('" + name + "')";
			jdbcTemplate.execute(sql);
			if ("".equals("")) {
				throw new NullPointerException();
			}
		}
	}
}
