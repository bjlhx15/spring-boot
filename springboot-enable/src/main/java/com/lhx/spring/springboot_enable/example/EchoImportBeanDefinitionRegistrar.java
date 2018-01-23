package com.lhx.spring.springboot_enable.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		Map<String, Object> map = importingClassMetadata.getAnnotationAttributes(EnableEcho.class.getName());
		String[] packArr = (String[]) map.get("packages");

		List<String> packages = Arrays.asList(packArr);
		System.out.println("packages:" + packages);
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
		builder.addPropertyValue("packages", packages);

		registry.registerBeanDefinition(EchoBeanPostProcessor.class.getName(), builder.getBeanDefinition());
	}

}
