package com.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForAlertsWithUtility {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
	//Alert alert = Utility.waitForAlert(driver);
		Alert alert =Utility.waitForAlert(driver, 50);
		String str = alert.getText();
		System.out.println("Text is " + str);
		alert.accept();
		driver.quit();

	}

}