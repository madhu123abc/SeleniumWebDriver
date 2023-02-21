package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://ineuron-courses.vercel.app/login");
		driver.findElement(By.xpath("//input[@id=\"email1\"] ")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.xpath("//input[@id=\"password1\"]")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
         Actions act =new Actions(driver);
         act.moveToElement(driver.findElement(By.xpath("//span[1]/parent::div"))).build().perform();
        driver.findElement(By.xpath("//a[contains(@href,'/course/manage')]")).click();
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Add New Course ')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

        
       
    		 
        //driver.findElement(By.xpath("//button[contains(text(),'Add New Course ')]")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@id='instructorNameId']")).sendKeys("nam");
        driver.findElement(By.xpath("//input[@id='price']")).sendKeys("22");
        driver.findElement(By.xpath("//div[contains(text(),'Select Category')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'menu-item')][3]")).click();
        driver.findElement(By.xpath("//input[@id='thumbnail']"));
        driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys("C:\\Users\\dines\\OneDrive\\Documents\\ineuron.PNG ");
        
        driver.findElement(By.cssSelector("#description")).sendKeys("Testing");
      driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//td[contains(text(),'Testing')]//following::button")).click();
		
      // driver.findElement(By.xpath("//button[contains(@class,'action-btn delete-btn')]")).click();
       
        /*Select dropdown =new Select(staticDropdown);
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirsxecutortSelectedOption().getText());*/
        
        
	}

}

/*
 * Task - Create a course Open https://ineuron-courses.vercel.app/login Login
 * with below credentials ineuron@ineuron.ai Ineuron Mouse Hover on manage Click
 * on Manage courses Click on add new course Fill all details Verify course has
 * been added Delete created course Verify course has been deleted Logout from
 * application
 */
