package com.crossbrowser;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readEcel() throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File("./testdata/TestData.xlsx")));
	    XSSFSheet sheet = wb.getSheet("loginpage");
	    
		
		System.out.println(wb.getSheet("loginpage").getRow(0).getCell(0).getStringCellValue());
         System.out.println(wb.getSheet("loginpage").getRow(2).getCell(1).getStringCellValue());
         System.out.println(wb.getSheet("users").getRow(1).getCell(0).getStringCellValue());
         System.out.println(wb.getSheet("users").getRow(1).getCell(1).getNumericCellValue());

		
            
	}

}
