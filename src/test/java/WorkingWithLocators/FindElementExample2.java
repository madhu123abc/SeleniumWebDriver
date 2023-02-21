package WorkingWithLocators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementExample2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		Select month = new Select(driver.findElement(By.id("month")));
		List<WebElement> allDDoptions = month.getOptions();
		int totalDropdowns = allDDoptions.size();
		System.out.println(totalDropdowns);
		int i=-1;
		while(i<=totalDropdowns)
		{   
			++i;
			
			
			 WebElement ele =allDDoptions.get(i);
		    String values= ele.getText();
		 System.out.println("values are  :"+values );
		
		if(values.contains("Dec")) {
			System.out.println("Found");
			break;
		}
		}
		
		
		
		
		
		/*Iterator<WebElement> alIterator = allDDoptions.iterator();
		while (alIterator.hasNext()) {
			WebElement ele = alIterator.next();
			System.out.println(ele.getText());

		}
		*/
		
			
	}	 
}

//	
