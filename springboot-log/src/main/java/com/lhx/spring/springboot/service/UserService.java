package com.lhx.spring.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	private Logger log = LoggerFactory.getLogger(UserService.class);
	public void log() {
		log.debug("user dao debug log");
		log.info("user dao info log");
		log.warn("user dao warn log");
		log.error("user dao error log");
	}
}
