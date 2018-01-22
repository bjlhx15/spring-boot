package com.lhx.spring.springboot_enable;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] {"com.lhx.spring.springboot_enable.User",Role.class.getName(),MyConfiguration.class.getName()};
	}

}
