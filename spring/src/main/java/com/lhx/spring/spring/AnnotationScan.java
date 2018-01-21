package com.lhx.spring.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackages="com.lhx.spring.spring",excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes=DogConfig.class))
@Configuration
public class AnnotationScan {

}
