package DesiredCap_OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLIsseue {

	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * 
		 * 
		 */

		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://lms.testautomationacademy.in/courses/40667-sdet-master-class-june-2022");
		System.out.println("Title is " + driver.getTitle());
		System.out.println("URL is  " + driver.getCurrentUrl());
		//driver.quit();

	}

}
