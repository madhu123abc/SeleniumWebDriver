package com.switchToCommandsDemo;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		driver.findElement(By.xpath("//div[@class='social']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Thread.sleep(1000);
         String child =driver.getWindowHandle();
         Thread.sleep(1000);
         driver.switchTo().window(child);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		String child2 = driver.getWindowHandle();
		//driver.switchTo().window(parentHandle);
		//driver.switchTo().window(child);
		Thread.sleep(1000);
		driver.switchTo().window(child2);
	}

}
