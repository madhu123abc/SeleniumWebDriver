package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='username'and@placeholder='Username']")).sendKeys("Admin");
    //3 css selectors    
            
        //driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("")).sendKeys("admin123");

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}   

}
/*Task 1
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login


Try to use contains , xpath axes, text functions

Write a minimum 3 XPath and 3 CSS Selector for the username 

Write a minimum 3 XPath and 3 CSS Selector for the password

Write a minimum 3 XPath and 3 CSS Selector for the login button  


Task 2
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
admin/admin123

Write dynamic xpath which should match all below elements

 
Click on Admin Tab 

Click on Add button 

Type A in employee name and write XPath which matches all element in suggestions



Write xpath (min 3 and  max no limit) for all elements under Add User section







Task 3
Write a script that should be able to add user > search user > delete the user.

Flow- Login > Admin> Add User> Search User > Delete User > Logout

Add an assertion after each section

https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Admin/admin123*/
