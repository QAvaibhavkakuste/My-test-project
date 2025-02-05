package com.javafortesters.chap006domainentities.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.javafortesters.domainentities.User;

public class UserTest {
	
	@Test
	public void canConstructANewUser() {
		User user = new User();
	}

	@Test
	public void userHasdefaultUsernameAndPassword() {
		User user = new User();
		
		Assert.assertEquals(user.getUsername(), "username", "Default username expected");
		Assert.assertEquals(user.getPassword(), "password", "Default password expected");;
	}
}
