package com.ddtviaExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingConfiguration {
@Test

public void readConfig() throws IOException {
	File src =new File(System.getProperty("user.dir")+"/config/config.properties");
	FileInputStream fis =new FileInputStream(src);
	Properties pro =new Properties();
	pro.load(fis);
	System.out.println(pro.get("prodURL"));
	System.out.println(pro.get("qaURL"));
	System.out.println(pro.get("headless"));
	System.out.println(pro.get("CityName"));
}
	
}
