package com.seleniumTimeouts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.helper.Utility;

public class CaptureDate2 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		Utility.captureScreenshot(driver);;
		Utility.waitForSeconds(2);
		Utility.captureScreenshot(driver);;

		Utility.waitForSeconds(2);
		Utility.captureScreenshot(driver);;

        Utility.waitForSeconds(2);
		Utility.captureScreenshot(driver);
		Utility.waitForSeconds(5);
	}

}