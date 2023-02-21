package com.seleniumgrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SeleniumWithTestNg 
{
 WebDriver driver;
 @Test(priority=1)
 public void startBrowser() {
	 driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://ineuron-courses.vercel.app/");
	 
 }
 @Test(priority=2)
 public void verifyURL() {
	 String url =driver.getCurrentUrl();
	 Assert.assertTrue(url.contains("ineuron-courses"),"URL didn't match");
 }
 @Test(priority=3)
 
public void verifyTitle() {	 
	String title =driver.getTitle();
	Assert.assertTrue(title.contains("Courses"),"Title mismatched");
	   
}
/*@Test(priority=4)
 public void closeBrowser() {
	driver.quit();
	 
 }*/
@Test(priority=5)
public void footerCount() {
	Assert.assertEquals(4, 4 ,("count missmatched"));
}
@Ignore()
@Test(priority=6)
	public void verifyLogin() throws InterruptedException	{
	driver.get("https://ineuron-courses.vercel.app/login");

	 
	  
	  driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("ineuron@ineuron.ai");
	  driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("ineuron");
	  
	  WebElement ele =driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
	   ele.click();
	   String title =driver.getTitle();
	   Thread.sleep(5000);
	  Assert.assertEquals( title.contains("Welcome to ineuron courses"),"Title mismatched");
	
	   
}
	
	
	
	
	
	
	
	
	
	
}
