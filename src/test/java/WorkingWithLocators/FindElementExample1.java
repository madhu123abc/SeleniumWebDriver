package WorkingWithLocators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementExample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();;
		Thread.sleep(1000);
		Select month = new Select(driver.findElement(By.id("month")));
        List<WebElement>allDDoptions=month.getOptions();
            int totalDropdowns  =allDDoptions.size();
            System.out.println(totalDropdowns);
        for(int i=0;i<=totalDropdowns ;i++) {
        WebElement ele =allDDoptions.get(i);
        	String values =ele.getText();
        	System.out.println("Values are : " +values );
        	
        	if(values.contains("Mar")) {
        		System.out.println("Found");
        	  break;
        	}
        }
        driver.quit();
        }
        
        
        
        
        
        
        /* for(WebElement ele:allDDoptions) {
        	 
        	 String values  = ele.getText();
        	 
        	 System.out.println("String Values are :" +values);
        	 
         
         if(values.contains("Aug")) {
        	 System.out.println("FOUND");
        	 break;
         }
         }*/
        // driver.quit();
         
         /*
          * Whenever u need to deal with > 1 use find elements suggestion
          * AutoSuggestion
          * DropDown without select
          * Calenda
          * 
          * 2. Optional Checks
          * 3.with TagName
          * 
          * 
          * 
          * 
          */
         
	}
