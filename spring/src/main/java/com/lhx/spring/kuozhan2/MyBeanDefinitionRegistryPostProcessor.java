package com.lhx.spring.kuozhan2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		for (int i = 0; i < 10; i++) {
			BeanDefinitionBuilder rootBeanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
			rootBeanDefinition.addPropertyValue("name", "admin" + i);
			registry.registerBeanDefinition("person" + i, rootBeanDefinition.getBeanDefinition());
		}

	}

}
