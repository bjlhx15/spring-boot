package com.lhx.spring.springboot_enable;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		registry.registerBeanDefinition("user",
				BeanDefinitionBuilder.rootBeanDefinition(User.class).getBeanDefinition());

		registry.registerBeanDefinition("role",
				BeanDefinitionBuilder.rootBeanDefinition(Role.class).getBeanDefinition());
		registry.registerBeanDefinition(MyConfiguration.class.getName(),
				BeanDefinitionBuilder.rootBeanDefinition(MyConfiguration.class).getBeanDefinition());

	}

}
