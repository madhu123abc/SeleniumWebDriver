package com.switchToCommandsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowHandle2Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app//login");
		String parent = driver.getWindowHandle();
		System.out.println("Title of main page" + driver.getCurrentUrl());
		 driver.switchTo().newWindow(WindowType.WINDOW);
		System.out.println(driver.getWindowHandles());
		driver.get("https://ineuron-courses.vercel.app/signup");
		System.out.println("Title of child page after Autoswitch " + driver.getCurrentUrl());
	      driver.close();
		driver.switchTo().window(parent);
		System.out.println("Title of main page after switch back to parent page :" + driver.getCurrentUrl());
		
	}

}
