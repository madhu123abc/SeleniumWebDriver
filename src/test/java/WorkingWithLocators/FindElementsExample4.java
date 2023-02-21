package WorkingWithLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample4 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	List<WebElement>allLinks	=driver.findElements(By.tagName("a"));
        	int	 totaltagList   =allLinks.size();
        	System.out.println(totaltagList);
        	for(WebElement ele: allLinks) {
        		System.out.println("Get Text is :" +ele.getText());
        	}
        	System.out.println("*************************");
        	for(WebElement ele: allLinks) {
        		System.out.println("Link Test is :"+ele.getAttribute("inner html"));
        	
        	}
        	System.out.println("*********************");
        	for(WebElement ele: allLinks) {
        		System.out.println("Link Test is :"+ele.getAttribute("outer html"));
        	
        	}
        	System.out.println("*********************");
        	
        	for(WebElement ele: allLinks) {
        		System.out.println("href value is :"+ele.getAttribute("href"));
        	
        	}
	}

}
