package WorkingWithLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		List<WebElement> allInputTag = driver.findElements(By.xpath("//input[@type='text']"));
		// this will return number of input tag with Text
		 for(WebElement ele :allInputTag) {
	        	String  name  =ele.getAttribute("name");
	        	System.out.println(name);
	        }
		System.out.println(allInputTag.size());
		int totalDropdowns = driver.findElements(By.tagName("select")).size();
		int totalDropdownswithxpath = driver.findElements(By.xpath("//select")).size();
		int totalCheckboxes = driver.findElements(By.xpath("//input[@type='radio']")).size();
		int totalPasswordfields = driver.findElements(By.xpath("//input[@type='password']")).size();
        System.out.println(totalDropdowns);
        System.out.println(totalDropdownswithxpath);
        System.out.println(totalCheckboxes);
        System.out.println(totalPasswordfields);
        
      //  for(WebElement ele :allInputTag) {
        	//String  name  =ele.getAttribute("name");
        //	System.out.println(name);
       // }
        
	}

}
