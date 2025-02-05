package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

import packagdomainobject.TestAppEnv;

public class TestAppEnvironmentTest {

	@Test
	public void canGetUrlStatically() {
		Assert.assertEquals(TestAppEnv.getUrl(), "http://216.48.182.131:81", "Returns Hard Coded URL");

	}
	
	@Test
	public void canGetDomainAndPortStatically() {
		Assert.assertEquals(TestAppEnv.DOMAIN, "216.48.182.131", "just the Domain");
		
		Assert.assertEquals(TestAppEnv.PORT, "81", "just the Port");
		

	}
}
