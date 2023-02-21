package com.assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.findElements(By.tagName("a")).size());
		Thread.sleep(1000);
		WebElement footerDriver = driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/.."));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		for (int i = 1; i < footerDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> itr = abc.iterator();
			while (itr.hasNext()) {
				driver.switchTo().window(itr.next());
				System.out.println(driver.getTitle());
			}

		}
	

}
