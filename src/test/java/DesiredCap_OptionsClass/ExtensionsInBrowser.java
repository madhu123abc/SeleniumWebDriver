package DesiredCap_OptionsClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionsInBrowser {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		System.out.println(System.getProperty("user.dir"));
		File src = new File(System.getProperty("user.dir")+" \\plugins\\SelectorsHub.crx");
		//File src =new File("C:\\Users\\dines\\OneDrive\\Desktop\\SepBatch\\ineuron\\SeleniumWebDriver\\src\\plugins\\SelectorsHub.crx");
		opt.addExtensions(src);
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");
		System.out.println("Title is " + driver.getTitle());
		System.out.println("URL is  " + driver.getCurrentUrl());
		// driver.quit();

	}

}
//(System.getProperty("user.dir")+"\\testData\\testData.csv");
//File myCSVFile =new File(System.getProperty("user.dir")+"\\testData\\testData.csv");
//System.out.println(Syslltem.getProperty("user.dir"));