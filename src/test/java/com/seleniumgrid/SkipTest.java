package com.seleniumgrid;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTest{

	@Test()
	public void login() {
		Assert.assertTrue(true);
		Reporter.log("Login to application" ,true);
	}
	@Test()	
	public void logout() {
		Assert.assertTrue(true);
		Reporter.log("Logout from application",true);
		
	}

	

}
