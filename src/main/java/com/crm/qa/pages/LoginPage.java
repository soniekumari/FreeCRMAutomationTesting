package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
//	Page factory - OR
	
	@FindBy(xpath = "//header//nav/div[2]/div/a/span")
	WebElement startHereBtn;
	
	@FindBy(name = "email")
	WebElement emailId;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id='ui']//form/div/div[3]")
	WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String email, String pwd) {
		startHereBtn.click();
		emailId.sendKeys(email);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}
}
