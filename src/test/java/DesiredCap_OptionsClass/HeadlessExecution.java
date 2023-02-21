package DesiredCap_OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecution {

	public static void main(String[] args) {
		
		ChromeOptions opt =new ChromeOptions();
		//opt.addArguments("--headless");
	
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");
		
		//opt.setHeadless(true);
		WebDriver driver =new ChromeDriver(opt);
		driver.get("http://www.facebook.com");
		System.out.println("Title is "+driver.getTitle());
		System.out.println("URL is  "+driver.getCurrentUrl());
		//driver.quit();

	}

}
