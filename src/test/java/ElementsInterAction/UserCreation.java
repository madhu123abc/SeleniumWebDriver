package ElementsInterAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserCreation {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
     // driver =new ChromeDriver();
     // driver =new ChromeDriver();
     // driver=new ChromeDriver();
    //  driver.get("http://www.google.com");//in this condition 3 objects are created but there is no pointer that's why for the last object
       //session id was created
      
      driver.get("https://www.facebook.com");
      driver.findElement(By.xpath("//a[text()=\"Create new account\"] ")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Madhavi");
      driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("Duddu");
      driver.findElement(By.xpath("//input [@aria-label ='Mobile number or email']")).sendKeys("999898989898");
        WebElement monthDropdown   =driver.findElement(By.xpath("//select[@aria-label='Month']"));
        Select month =new Select(monthDropdown);
        month.selectByIndex(2);
        month.selectByValue("11");
        month.selectByVisibleText("Sep");
      WebElement ele =month.getFirstSelectedOption();
       System.out.println (ele.getText());
       
      
	}

}
