
import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.xpath("//a[contains(text(),'New user')] ")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Madhavi");
		driver.findElement(By.xpath("//div/input[2]")).sendKeys("Rohan@gmail.com");
		driver.findElement(By.xpath(" //input[contains(@name,'pass')]")).sendKeys("Ramsita@123");
		driver.findElement(By.xpath("//label[text()='Testing']")).click();
        driver.findElement(By.xpath("//input[@value =\"Female\"or name=\"gender\"]")).click();
         WebElement element  =driver.findElement(By.xpath("//select[@id=\"state\"] "));
        Actions act =new Actions(driver);
        act.moveToElement(element).perform();
        driver.findElement(By.xpath("//option[text()='Kerala']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();
       // driver.findElement(By.cssSelector(".submit-btn")).submit();
        JavascriptExecutor je =(JavascriptExecutor)driver;
            WebElement element1=driver.findElement(By.cssSelector(".submit-btn"));
        driver.findElement(By.cssSelector(".submit-btn")).isEnabled();
            je.executeScript("arguments[0].scrollIntoView(true);",element1);
            Thread.sleep(2000);
            element1.click();
              
        
	}  

}  