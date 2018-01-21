package com.lhx.spring.springboot_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {

	@Autowired
	private Environment env;
	@Value("${local.port}")
	private String localPort;
	@Value("tomcat.port")
	private String tomcatPort;
	@Value("${tomcat.port:9090}")
	private String tomcatPort2;

	public void show() {
		System.out.println("local.ip=" + env.getProperty("local.ip"));
		System.out.println("local.port=" + localPort);
		System.out.println("tomcat.port=" + tomcatPort);
		System.out.println("tomcat.port2=" + tomcatPort2);
	}
}
