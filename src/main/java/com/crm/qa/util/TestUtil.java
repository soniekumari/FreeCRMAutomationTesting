package com.crm.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
//	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static void mouseHoverContactSubMenu() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='main-nav']/div[3]/a/span"))).perform();
	}

}
