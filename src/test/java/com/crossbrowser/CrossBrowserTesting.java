package com.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.helper.Utility;

public class CrossBrowserTesting {

@Parameters("Browser")
@Test
public void login(String browserName) 	
{	
	System.out.println("Thread id is "+Thread.currentThread().getId());
	WebDriver driver = Utility.startBrowser(browserName, "http://google.com");
	Reporter.log(driver.getTitle(), true);
	driver.quit();
}
	
	
	
	
	
	
}
