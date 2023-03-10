package com.extentreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo 
{
	@Test
	
	public void generateReport() 
	{
		ExtentReports report =new ExtentReports();
		
		ExtentSparkReporter sparkReporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/MYHtmlReport.html");
		sparkReporter.config().setReportName("Automation Report");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setDocumentTitle("Sprint1 Automation Report");
	    report.attachReporter(sparkReporter);
	    
	    ExtentTest t1= report.createTest("Login Test");
	    t1.pass("Started Application");
	    t1.pass("Enter username");
	    t1.pass("Enter password");
	    t1.pass("Click Login");
	    t1.fail("Dashboard not present");

	    
	    ExtentTest t2= report.createTest("Payment Status");
	    t2.fail("Payment Test failed",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\dines\\Downloads\\selenium-logo.png").build());
	    
	    ExtentTest t3= report.createTest("Account  Status");
	    t3.skip("Account Test skipped");
	    
	    report.flush();
	}
	
	
	
	
	
	
	
	
}
