package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver();
	      driver.get("https://ineuron-courses.vercel.app/login");
	      driver.findElement(By.xpath("//input[contains(@id,'email1')]")).sendKeys("ineuron@ineuron.ai");
	     driver.findElement(By.xpath(" //input[@type='password']")).sendKeys("ineuron");
	    driver.findElement(By.xpath(" //button[@type='submit']")).click();

	}
}