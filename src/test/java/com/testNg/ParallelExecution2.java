package com.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution2 {
	@Test()
	public void test1() {
		System.out.println("Id is " + Thread.currentThread().getId());
		System.out.println("Name is  " + Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		driver.quit();
	}

	@Test()
	public void test2() {
		System.out.println("Id is" + Thread.currentThread().getId());
		System.out.println("Name is " + Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.quit();
	}

	@Test()
	public void test3() {
		System.out.println("Id is " + Thread.currentThread().getId());
		System.out.println("Name is " + Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.quit();
	}
}
