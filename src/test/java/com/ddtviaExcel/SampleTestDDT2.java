package com.ddtviaExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.helper.CustomDataProvider;
import com.helper.ExcelReader;

public class SampleTestDDT2 {
@Test(dataProvider="EmpDataSet",dataProviderClass =CustomDataProvider.class)
	public void sample(String fname,String lname,String email,String cost,String location)
	{
		System.out.println("*******Test Started*******");
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(cost);
		System.out.println(location);
		System.out.println("**********Test Completed**********");
		
		
	}
	
	
	
	
}
