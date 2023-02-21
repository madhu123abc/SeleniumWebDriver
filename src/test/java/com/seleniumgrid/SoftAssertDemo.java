package com.seleniumgrid;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test()
	public void test1() {//normal Assert
		Reporter.log("Test started",true);
		Assert.assertTrue(true);
		Reporter.log("Test failed",true);
	}
	@Test()
	
	public void test2() {
		Reporter.log("Test started",true);
		SoftAssert softAssert =new SoftAssert();
		softAssert.assertTrue(true);
		Reporter.log("Test End",true);
		softAssert.assertAll();
		
		
		
	}

}
