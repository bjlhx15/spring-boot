package com.lhx.spring.springboot_config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		try (InputStream input = new FileInputStream("d:/tmp/app.properties")) {
			Properties source = new Properties();
			source.load(input);
			PropertiesPropertySource propertySource = new PropertiesPropertySource("sy", source);
			environment.getPropertySources().addLast(propertySource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
