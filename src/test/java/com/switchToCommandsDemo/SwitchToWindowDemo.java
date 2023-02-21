package com.switchToCommandsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo {

	public static void main(String[] args) throws InterruptedException {
	
         WebDriver driver =new ChromeDriver();
         driver.get("https://ineuron-courses.vercel.app/login");
        String parentHandle =driver.getWindowHandle();
        System.out.println(parentHandle);
        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
          Set<String> allHandles  =  driver.getWindowHandles();
          System.out.println("AllWindowHandles including parent Handles  :" +allHandles );
          List<String>allHandlesinlist =new ArrayList<String>(allHandles);
            System.out.println("Parent Window Handle is: "+allHandlesinlist.get(0));
            System.out.println("Child Window Handle is: " +allHandlesinlist.get(1));
            Thread.sleep(3000);
            driver.switchTo().window(allHandlesinlist.get(1));
            Thread.sleep(1000);
            System.out.println("Title of new tab is:         "+driver.getTitle());
            Thread.sleep(1000);
            driver.switchTo().window(allHandlesinlist.get(0));
            Thread.sleep(1000);
            System.out.println("Title of new tab is:      "+driver.getTitle());
            Thread.sleep(1000);
            driver.switchTo().window(allHandlesinlist.get(1));
            
            System.out.println("Title of new tab is:      "+driver.getTitle());
	}

}
