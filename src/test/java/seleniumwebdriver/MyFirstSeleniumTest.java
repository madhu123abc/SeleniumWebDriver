package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		// driver.close();//closes active tab /window
		System.out.println(" URL is    " + driver.getCurrentUrl());
		System.out.println("Title is" + driver.getTitle());

		driver.get("http://www.yahoo.com");
		System.out.println(" URL is    " + driver.getCurrentUrl());
		System.out.println("Title is" + driver.getTitle());

	
		driver.get("http://www.twitter.com");
		System.out.println("Url is            " + driver.getCurrentUrl());
		System.out.println("Title is         " + driver.getTitle());
		
		driver.get("http://www.facebook.com");
		System.out.println("Url is            " + driver.getCurrentUrl());
		System.out.println("Title is         " + driver.getTitle());


	}

}
