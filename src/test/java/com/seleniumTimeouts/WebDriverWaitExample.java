package com.seleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
         driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
         WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
         String text= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='WebDriver']"))).getText();
         System.out.println(text);
         
	}

}