package com.lhx.spring.springboot.mapper;

import static org.junit.Assert.*;

import javax.validation.constraints.Null;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserMapperTest {

	@MockBean
	private UserMapper usermapper;

	@Before
	public void init() {
		BDDMockito.given(usermapper.createUser("admin")).willReturn(Integer.valueOf(1));
		BDDMockito.given(usermapper.createUser("")).willReturn(Integer.valueOf(0));
		BDDMockito.given(usermapper.createUser(null)).willThrow(NullPointerException.class);
	}

	@Test(expected = NullPointerException.class)
	public void testCreateUser() {
		Assert.assertEquals(Integer.valueOf(1), usermapper.createUser("admin"));
		Assert.assertEquals(Integer.valueOf(0), usermapper.createUser(""));
		Assert.assertEquals(Integer.valueOf(0), usermapper.createUser(null));
	}
}
