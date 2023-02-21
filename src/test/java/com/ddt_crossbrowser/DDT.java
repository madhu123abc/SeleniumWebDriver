package com.ddt_crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.helper.Utility;

public class DDT {
WebDriver driver;
@BeforeMethod	
public void setUp() {
	Reporter.log("Setting up browser",true);
 driver=Utility.startBrowser("Chrome" , "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Reporter.log("Application is up and running",true);
}
@AfterMethod	
public void closeSession() {
	Reporter.log("Terminating session",true);
	driver.quit();			
	Reporter.log("Session Terminated",true);

}
	
	@Test(dataProvider ="loginData")
	public void test1(String uname ,String pass) 
	{
		
		
		/*Reporter.log(uName,true);
		Reporter.log(pass,true);*/
		//WebDriver driver=Utility.startBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[contains(@class,'login-button')]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		driver.findElement(By.xpath("//p[contains(text(),'Paul Allen')]")).click();
		driver.findElement(By.xpath(" //a[contains(text(),'Logout')]")).click();		

	}
	
	@DataProvider(name="loginData")
	public Object[][]getData()
	{
		Object[][] arr =new Object[5][2];
		arr[0][0]="admin";
		arr[0][1]="admin 123";
		
		arr[1][0]="selnium";
		arr[1][1]="java";
		
		arr[2][0]="maven";
		arr[2][1]="testng";
		
		arr[3][0]="jenkins";
		arr[3][1]="github";
		
		arr[4][0]="admin";
		arr[4][1]="admin123";
		
		return arr;
	}
	
}
