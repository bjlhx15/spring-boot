package com.lhx.spring.springboot_web;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootConfiguration
public class WebServletConfiguration {
	@Bean
	public EmbeddedServletContainerFactory createEmbeddedServletContainerFactory() {
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setPort(1008);
		factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
		
		factory.addInitializers((servletContext)->{
			System.out.println("----------servletContext startup----------");
		});
		return factory;
	}
}
