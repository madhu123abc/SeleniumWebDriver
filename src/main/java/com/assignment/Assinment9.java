package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assinment9 {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver =new ChromeDriver();
            driver.get("https://ineuron-courses.vercel.app/signup");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          boolean value  =driver.findElement(By.xpath("//h2[contains(text(), 'Sign Up')]")).isDisplayed();
          System.out.println(value);
          driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Madhavi");
          driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Madhavi@yahoo.com");
          driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Madhavi");
          driver.findElement(By.xpath("//label[text()='Testing']")).click();
          driver.findElement(By.xpath("//input[@value='Female']")).click();
          Select dropdown =new Select(driver.findElement(By.xpath("//select[@name='state']")));
          dropdown.selectByValue("Goa");
          boolean data= driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).isEnabled();
          System.out.println(data);
          Thread.sleep(5000);
          driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
	}

}



/*Open https://ineuron-courses.vercel.app/signup
Verify Sign up button is disabled
FIll all details
Verify Sign up button is enabled
Click on Sign up button
Verify user is created or not (by login with same credentails)*/
