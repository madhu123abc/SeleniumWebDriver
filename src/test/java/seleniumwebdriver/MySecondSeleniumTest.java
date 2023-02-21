package seleniumwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySecondSeleniumTest {
public static void main( String []args) throws MalformedURLException {
	/*ChromeDriver driver =new  ChromeDriver ();
	driver.get("http:www.google.com");
	System.out.println(" PageSource     "+driver.getPageSource());
	            
	WebDriver driver1 =new ChromeDriver();
	SearchContext driver2 =new ChromeDriver();
	Object driver3 =new ChromeDriver();
	WebDriver driver4 =new RemoteWebDriver(new URL(""),new DesiredCapabilities());*/
	
	//WebDriverManager.chromedriver().setup();
	WebDriverManager.edgedriver().setup();
	WebDriver driver =new EdgeDriver();
	driver.get("http://www.yahoo.com");
	//WebDriverManager.edgedriver().setup();
	//WebDriver driver =new ChromeDriver();
	//driver.get("http://www.google.com");
	//driver.quit();
	
	
	
	
	
	
	
	
	
	
	
}
}
