package com.lhx.spring.springboot.controller;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BookControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testHome() {
		String object = restTemplate.getForObject("/book/home", String.class);
		Assert.assertEquals("home", object);
	}
	
	@Test
	public void testShow() {
		String object = restTemplate.getForObject("/book/show?id=100", String.class);
		Assert.assertEquals("book100", object);
	}
}
