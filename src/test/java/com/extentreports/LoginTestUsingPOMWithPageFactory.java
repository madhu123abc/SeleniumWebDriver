package com.extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.helper.Utility;

public class LoginTestUsingPOMWithPageFactory {
public void validLogin() {
	WebDriver driver =Utility.startBrowser("Chrome","https://ineuron-courses.vercel.app/");
	HomePage home =PageFactory.initElements(driver, HomePage.class);
	LoginPage login  =home.clickOnLoginButton();
	login.loginToApplication(" ", " ");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
