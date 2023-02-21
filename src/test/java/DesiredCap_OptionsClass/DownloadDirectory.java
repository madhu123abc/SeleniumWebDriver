package DesiredCap_OptionsClass;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadDirectory {

	public static void main(String[] args) {
	 ChromeOptions op =new ChromeOptions();
	 File src =new File("");
	// src.
     Map<String,Object> map=new HashMap<String,Object>();
     map.put("download.default_directory", "C:\\Users\\dines\\OneDrive\\Desktop\\mydownload");
	 op.setExperimentalOption("prefs",map);
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://the-internet.herokuapp.com/download");	
	 driver.findElement(By.xpath("//a[contains(@href,'1.png')]")).click();
		
	/*
	 * verify file download using File class
	 * 
	 * 
	 * 	
	 */

	}

}
