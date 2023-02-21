package com.switchToCommandsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app//login");
		String parent_handle = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Set<String> allWindowHandle = driver.getWindowHandles();
		Iterator<String> itr = allWindowHandle.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!parent_handle.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				String title = driver.getTitle();
				System.out.println("Title of application is " +title);
             driver.close();
			}
		}
			 driver.switchTo().window(parent_handle);
			 System.out.println("Main application tile is " +driver.getTitle());
			 driver.quit();
		}

	

}
