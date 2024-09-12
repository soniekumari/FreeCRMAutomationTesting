package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {

	@FindBy(xpath = "//*[@id='main-nav']/div[3]/button/i")
	WebElement addContactForm;

	@FindBy(name = "first_name")
	WebElement firstName;

	@FindBy(name = "last_name")
	WebElement lastName;

	@FindBy(xpath = "//*[@id='main-content']/div/div[2]/form/div[7]/div[2]/div/label")
	WebElement phoneCurrect;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public ContactPage clickAddContactButton() {
		addContactForm.click();

		return new ContactPage();
	}

	public void enterFirstName() {
		firstName.sendKeys("KM");
	}

	public void enterLastName() {
		lastName.sendKeys("Soni");
	}
	
	public boolean checkPhoneFields() {
		return phoneCurrect.isDisplayed();
	}

}
