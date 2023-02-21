package com.seleniumgrid;

import org.testng.annotations.Test;

public class MyFirstTestNG2 {
	@Test(priority=1)
 public void login() {
	 System.out.println("Login to App");
 }@Test(priority =2)
public void createAccount() {	
	System.out.println("Account created");
	
	
}
 @Test()
public void makePayement() {
	System.out.println("Payment Done");
}
 @Test()
	
 public void logOutFromApp() {
	 System.out.println("Logout from app");
 }
}
//default priority =0;