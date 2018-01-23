package com.lhx.spring.springboot_enable.example;

import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class EchoBeanPostProcessor implements BeanPostProcessor {

	private List<String> packages;

	public List<String> getPackages() {
		return packages;
	}

	public void setPackages(List<String> packages) {
		this.packages = packages;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		for (String pack : packages) {
			if (bean.getClass().getName().startsWith(pack)) {
				System.out.println("echo bean:" + bean.getClass().getName());
			}
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}

}
