package WorkingWithLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindExample5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//img[@src]"));
          for(WebElement ele :allLinks) {
        	  //System.out.println("List Value is:"+  ele.getText());
        	  //System.out.println("href value is:" +ele.getAttribute("href"));
        	  System.out.println("image is:" +ele.getAttribute("src"));
        	  
          }
          //driver.quit();
	}

}
