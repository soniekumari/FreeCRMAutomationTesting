package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


public class HomePage extends TestBase{
	
	@FindBy(xpath = "//*[@id='top-header-menu']/div[2]/span[1]")
	WebElement userName;
	
	@FindBy(xpath = "//*[@id='main-nav']/div[3]/a/span")
	WebElement contactLink;
	
	@FindBy(xpath = "//*[@id='main-nav']/div[5]/a/span")
	WebElement dealsLink;
	
	@FindBy(xpath = "//*[@id='main-nav']/div[6]/a/span")
	WebElement taskLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public Boolean verifyUserName() {
		return userName.isDisplayed();
	}
	
	public ContactPage clickOnContactLink() {
		contactLink.click();
		return new ContactPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TaskPage clickOnTaskLink() {
		taskLink.click();
		return new TaskPage();
	}
}
