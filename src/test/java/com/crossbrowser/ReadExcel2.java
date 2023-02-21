package com.crossbrowser;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel2 {

	@Test
	public void readEcel() throws IOException {
		File src = new File("./testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheetCount = wb.getNumberOfSheets();
		System.out.println(sheetCount);
		XSSFSheet sheet = wb.getSheet("loginpage");
		int row = sheet.getPhysicalNumberOfRows();
		int newRowCount  =sheet.getLastRowNum();
		System.out.println("Total Rows" +row);
		System.out.println("TotalRows new count" +newRowCount);
		XSSFRow r1 =sheet.getRow(0);
		 XSSFCell c1 =r1.getCell(0);
		System.out.println("Get cell " +c1.getStringCellValue());
            
	}

}
