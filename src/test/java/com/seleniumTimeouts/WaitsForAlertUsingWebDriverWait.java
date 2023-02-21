package com.seleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsForAlertUsingWebDriverWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		// Alert alert =new
		// WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.alertIsPresent());u
		// can do it in one step
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String text = alert.getText();
		System.out.println("Text is  " + text);
		alert.accept();
		//Boolean url = wait.until(ExpectedConditions.urlContains("seloooo"));
		//System.out.println("URL is  " + url);
		//Boolean b = wait.until(ExpectedConditions.titleContains("Confirmed"));
		Boolean value = wait.until(ExpectedConditions.urlContains("blogspot"));
       System.out.println(value);
        String s= driver.getCurrentUrl();
        System.out.println(s);
        //present,visible,enable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" ")));
       // present ,visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));
        //present
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("  ")));
	}

}
