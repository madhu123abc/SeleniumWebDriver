package com.assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends')]")).getText());
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='pageFooter']"));
		// System.out.println(footerDriver.findElements(By.tagName("a")).size());
		// System.out.println( footerDriver.getText());

		
		List<WebElement> validationMsg = footerDriver.findElements(By.tagName("a"));
		for (int i = 0; i < validationMsg.size(); i++) {
			System.out.println(validationMsg.get(i).getText());
		}
		if (driver.getPageSource().contains("Create Page")) {
			System.out.println("Create page link is present");

		}

		else {

			System.out.println("Create Page link is not present");

		}
		driver.findElement(By.xpath("//a[contains(text(),'Create Page')]")).click();
	}

}

/*
 * Open ​​https://www.facebook.com/ Capture all link text available in the
 * footer section and verify Create Page Link is present or not. If yes then
 * click on it.
 */
