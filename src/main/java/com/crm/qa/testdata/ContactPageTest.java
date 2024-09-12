package com.crm.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	
	public ContactPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		contactPage = new ContactPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("emailid"), prop.getProperty("password"));
		TestUtil.mouseHoverContactSubMenu();
		contactPage = homePage.clickOnContactLink();
		contactPage.clickAddContactButton();
	}
	
	@Test(priority = 1)
	public void verifyEnterFirstName() {	
		contactPage.enterFirstName();
	}
	@Test(priority = 2)
	public void verifyEnterLastName() {
//		contactPage.clickAddContactButton();
		contactPage.enterLastName();
	}
	
	@Test(priority = 3)
	public void verifyPhoneField() {
//		contactPage.clickAddContactButton();
		Assert.assertTrue(contactPage.checkPhoneFields());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
