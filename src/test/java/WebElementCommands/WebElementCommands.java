package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	
	/*Selenium has direct Locators and  indirect Locators
	 * id
	 * name
	 * className .
	 * link text
	 * Partial linkText
	 * tag name
	 * xpath
	 * CSS Selector they belong to by class
	 * Selenium 4 has Relative Locators
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://ineuron-courses.vercel.app/login");
       WebElement userName= driver.findElement(By.id("email1"));
       userName.sendKeys("ineuron@ineuron.ai");
      // userName.clear();
      // Thread.sleep(2000);
      // userName.sendKeys("madhu.@gmail.com");
      // Thread.sleep(1000);
      // userName.clear();
     //  Thread.sleep(1000);
      // userName.sendKeys("ineuron@ineuron.ai");
      // userName.clear();
      // userName.sendKeys(null);
       driver.findElements(By.id("email")).get(0).sendKeys("mukesh");
	}

}
