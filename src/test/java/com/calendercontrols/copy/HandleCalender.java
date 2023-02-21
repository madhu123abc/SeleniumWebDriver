package com.calendercontrols.copy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		// driver.findElement(By.xpath("//a[text()='11']")).sendKeys("12/01/2022");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		// option2

		// driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		// driver.findElement(By.xpath("//a[text()='20']")).click();
		List<WebElement> allElements = driver.findElements(By.xpath("//table[contains(@class,'calendar')]//a"));
		for (WebElement element : allElements) {
			String dataText = element.getText();
			System.out.println("Datas are" + dataText);
			if (dataText.contains("24")) {
				System.out.println("Found");
				element.click();
				break;
			}
		}
			//System.out.println(driver.findElement(By.id("datepicker")).getText());
			System.out.println(driver.findElement(By.cssSelector(".hasDatepicker")).getAttribute("value"));
		
	}

}