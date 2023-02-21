package com.seleniumTimeouts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JSDemo3 {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
     JavascriptExecutor js =(JavascriptExecutor)driver;
     js.executeScript("document.getElementById('pass').value='Java'");


	}

}
