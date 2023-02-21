package com.calendercontrols.copy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title'] /span[1]")).getText().contains("August");
		while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-title'] /span[1]")).getText()
				.contains("August")) {
			driver.findElement(By.xpath(" //span[text()='Next']")).click();

		}

		List<WebElement> days = driver.findElements(By.cssSelector(".ui-state-default"));
		int count = driver.findElements(By.cssSelector(".ui-state-default")).size();
		for (int i = 0; i < count; i++) {
			String data = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			if (data.contains("28")) {
				System.out.println("Found");
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
				break;

			}
		}

	}

}
