package com.lhx.spring.springboot;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	@Before("execution (* com.lhx.spring.springboot.dao..*.*(..))")
	public void log() {
		System.out.println("method log done");
	}

	@Before("execution (* com.lhx.spring.springboot.dao..*.*(..))")
	public void logAfter(JoinPoint point) {
		System.out.println("after log done," + point.getTarget().getClass() 
				+ ",args=" + Arrays.asList(point.getArgs())
				+",method="+point.getSignature());
	}
}
