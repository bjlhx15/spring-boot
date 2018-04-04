package com.lhx.spring.springboot.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	private Logger log = LoggerFactory.getLogger(UserDao.class);
	public void log() {
		log.debug("user dao debug log");
		log.info("user dao info log");
		log.warn("user dao warn log");
		log.error("user dao error log");
	}
}
