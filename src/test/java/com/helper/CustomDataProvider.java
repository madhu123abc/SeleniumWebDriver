package com.helper;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
@DataProvider(name="EmpDataSet")	
public static Object[][] getData()	{
	Object[][] arr =ExcelReader.getDataFromSheet("Employee");
	return arr;
	
	
}
	
}
