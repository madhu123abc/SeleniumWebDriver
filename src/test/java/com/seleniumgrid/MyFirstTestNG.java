package com.seleniumgrid;

import org.testng.annotations.Test;

public class MyFirstTestNG {
	@Test(description ="My first test")
 public void test1() {
	 System.out.println("Test1 Executed");
 }@Test(description ="My second Test")
public void test2() {	
	System.out.println("Test2 Executed");
	
	
}
 @Test(description ="My third test")
public void test3() {
	System.out.println("Test3 Executed");
}
	
}
