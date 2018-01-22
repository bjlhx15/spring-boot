package com.lhx.spring.springboot_auto_config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GBKCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String encoding = System.getProperty("file.encoding");
		if (encoding != null) {
			return "gbk".equalsIgnoreCase(encoding);
		}
		return false;
	}

}
