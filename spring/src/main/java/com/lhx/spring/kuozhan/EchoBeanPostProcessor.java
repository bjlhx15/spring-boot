package com.lhx.spring.kuozhan;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("--------------postProcessBeforeInitialization-------------" + "bean" + bean.getClass());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("--------------postProcessAfterInitialization-------------" + "bean" + bean.getClass());
		return bean;
	}

}
