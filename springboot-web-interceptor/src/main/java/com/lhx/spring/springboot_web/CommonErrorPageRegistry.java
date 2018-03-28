package com.lhx.spring.springboot_web;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

//@Component  //测试全局的县注释掉
public class CommonErrorPageRegistry implements ErrorPageRegistrar {

	@Override
	public void registerErrorPages(ErrorPageRegistry registry) {
		ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
		ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
		ErrorPage args = new ErrorPage(IllegalArgumentException.class, "/args.html");
		registry.addErrorPages(e404);
		registry.addErrorPages(e500);
		registry.addErrorPages(args);
	}

}
