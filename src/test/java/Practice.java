import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main (String[]args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://login.yahoo.com/");
     Thread.sleep(1000);
	driver.findElement(By.id("persistent")).click();
	//Thread.sleep(1000);
	//JavascriptExecutor js =(JavascriptExecutor)driver;
	//js.executeScript("arguements[0].click()", element);
}
}
