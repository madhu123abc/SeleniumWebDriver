package com.seleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumPageLoad {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	//Always use before get method then only it take affects.
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	//Always use before get method then only it take affects.
	//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
    //driver.get("https://learn-automation.com/");
    
    System.out.println(driver.manage().timeouts().getPageLoadTimeout().getSeconds());//300sec
    System.out.println(driver.manage().timeouts().getScriptTimeout().getSeconds());//30sec
    System.out.println(driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());//0
    
    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']")).click();
    
    WebElement ele  =driver.findElement(By.xpath("//p[@id='demo']"));
    System.out.println(ele.isDisplayed());
	}

}
