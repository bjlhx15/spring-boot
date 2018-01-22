package com.lhx.spring.springboot_enable;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector2 implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println(importingClassMetadata.getAllAnnotationAttributes(EnableLog.class.getName()));
		//可以得到注解详细信息
		return new String[] { "com.lhx.spring.springboot_enable.User", Role.class.getName(),
				MyConfiguration.class.getName() };
	}

}
