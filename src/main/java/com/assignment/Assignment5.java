package com.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		String url = ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.get(url);
		Thread.sleep(1000);
		String sturl = driver.getCurrentUrl();
		System.out.println(sturl);
		if (sturl.contains("login"))
			System.out.println(" url ends with login");
		else
			System.out.println(" url not ends with login");

		if (sturl.contains("Demo"))
			System.out.println(" url contains demo");
		else
			System.out.println(" url not contains demo");

		if (sturl.contains("HRM"))
			System.out.println(" url contains HRM");
		else
			System.out.println(" url not contains HRM");

	}

}
