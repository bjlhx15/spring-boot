package com.lhx.spring.springboot.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.EnvironmentTestUtils;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties= {"app.version=1.0.0"})
public class EnvTest {
	@Autowired
	private ConfigurableEnvironment env;

	@Before
	public void init() {
		EnvironmentTestUtils.addEnvironment(env, "app.admin.name=admin");
	}
	@Test
	public void testEnv() {
		Assert.assertEquals("springboot", env.getProperty("app.name"));
	}
}
