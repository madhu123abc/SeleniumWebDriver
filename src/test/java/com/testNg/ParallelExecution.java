package com.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution {
	@Test()
	public void test1() {
		System.out.println("Id is " +Thread.currentThread().getId());
		System.out.println("Name is  " +Thread.currentThread().getName());
		Reporter.log("test 1 executed",true);
		
	}
	@Test()
    public void test2() {
		System.out.println("Id is"+Thread.currentThread().getId());
		System.out.println("Name is "+Thread.currentThread().getName());
		Reporter.log("test 1 executed",true);

    }
	@Test()
    public void test3() {
		System.out.println("Id is "+Thread.currentThread().getId());
		System.out.println("Name is "+Thread.currentThread().getName());
		Reporter.log("test 1 executed",true);

    }
}
