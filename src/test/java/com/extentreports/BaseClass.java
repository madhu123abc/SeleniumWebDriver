package com.extentreports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import helper.Utility;

public class BaseClass {
WebDriver driver;
@BeforeClass
public void setupApplication() {	
	driver  =Utility.startBrowser("Chrome","https://ineuron-courses.vercel.app/");

}
@AfterClass
public void tearDown() {	
	//driver.quit();

}
	
	
	
	
	
	
}
