package com.testNg;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo 
{
@Parameters("Browser")	
@Test()
	
public void test1(@Optional("Chrome")String Browser) {
	Reporter.log("Browsername is "+Browser,true);
}
}
