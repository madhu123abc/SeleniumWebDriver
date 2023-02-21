package com.extentreports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import helper.Utility;

public class LoginTestUsingPOM extends BaseClass {
	@Test
	public void validLogin() {
        HomePage homepage =new HomePage(driver);
       // homepage.clickLoginButton();
		//LoginPage loginpage = new LoginPage(driver);
           LoginPage login  =homepage.clickOnLoginButton();
		 login.loginToApplication("ineuron@ineuron.ai", "ineuron");
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed());

	}

}
