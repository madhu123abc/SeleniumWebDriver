package com.switchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickByJavaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		// driver.findElement(By.name("q")).sendKeys("Mukesh otwani");
		// Thread.sleep(1000);
		WebElement element = driver.findElement(By.name("btnI"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguements[0].click()", element);

	}

}
