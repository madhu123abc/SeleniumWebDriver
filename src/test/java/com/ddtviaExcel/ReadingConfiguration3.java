package com.ddtviaExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

import com.helper.ConfigReader;

public class ReadingConfiguration3 {
@Test

public void readConfig() throws IOException {
	ConfigReader.getProperty("stagingURL");
	System.out.println("url");
}
	
}
