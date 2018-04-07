package com.lhx.spring.springboot.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.lhx.spring.springboot.bean.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestBeanConfiguration.class)
public class ApplicationContextTest {

	@Autowired
	private ApplicationContext context;
	@Test
	public void testNull() {
		Assert.assertNotNull(context.getBean(User.class));
		Assert.assertNotNull(context.getBean(Runnable.class));
	}
}
