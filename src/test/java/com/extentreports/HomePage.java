package com.extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

WebDriver driver;	
public HomePage(WebDriver driver) {
	this.driver =driver;
	
}
@FindBy(xpath="//button[text()='Log in ']")WebElement loginButton;
@FindBy(how=How.XPATH,using="//button[text()='Log in ']")WebElement loginButtonNew;
/*@FindBy(id ="foobar")WebElement foobar;
@FindBy(how =How.ID,using ="foobar")WebElement foobar;*/
//By loginbutton =By.xpath("//button[text()='Log in ']");	
public LoginPage clickOnLoginButton() {
	loginButton.click();
//driver.findElement(loginbutton).click();
//PageFactory.initElements(driver, LoginPage.class);
return PageFactory.initElements(driver, LoginPage.class);

//LoginPage login =new LoginPage(driver);
//return login;
}



}
