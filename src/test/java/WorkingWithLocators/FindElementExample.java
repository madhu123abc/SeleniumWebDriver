package WorkingWithLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.google.com");
    driver.findElement(By.name("q")).sendKeys("Mukesh otwani");
    Thread.sleep(2000);
   List<WebElement> allElements  = driver.findElements(By.xpath("//div[@role='presentation'] "));
        System.out.println( "Total Elements are: "+allElements.size());
   for(WebElement ele :allElements) {
	   String text=ele.getText();
	   if(text.contains("github")){
		   ele.click();
		   break;
	   }
	   
   }
  // driver.quit();
	}

}
