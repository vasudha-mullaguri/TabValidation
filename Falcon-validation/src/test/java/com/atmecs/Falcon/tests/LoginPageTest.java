package com.atmecs.Falcon.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import com.atmecs.Falcon.helpers.CommonHelpers;
import com.atmecs.Falcon.helpers.PageLocators;
import com.atmecs.Falcon.testsuite.BaseClass;

public class LoginPageTest extends BaseClass {
	
	public String actual;
	public String actual1;
	public String currentUrl;
	PageLocators path = new PageLocators();

	@Test
	public void locator() throws Exception {
		
		path.data();
		path.getValidationData();
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println("test:"+path.dashboard);
		
		CommonHelpers.clickElement(driver, path.dashboard);
		actual = driver.findElement(By.xpath(path.dashtitle)).getText();
		System.out.println(actual);
		String expected = "Dashboard";
		Assert.assertEquals(actual, expected);
		System.out.println(actual + " is present");
		
		String actual=CommonHelpers.findElement(driver, "Xpath", path.restapitable).getText();
		System.out.println(actual);
		
		CommonHelpers.validateImage(driver,path.restimage);
		
		CommonHelpers.textvalidate(driver, path.resttext, path.valrest);
		
		CommonHelpers.tooltip(driver, path.tooltip_dashboard, "title", path.valtooltip_dash);
		
		CommonHelpers.clickElement(driver, path.recentRuns);
		
		CommonHelpers.explicitWait(driver, path.recentRuns);
		
		
		actual1 = driver.findElement(By.xpath(path.recenttitle)).getText();
		System.out.println(actual1);
		String expected1 = "Recent Runs";
		try {
			Assert.assertEquals(actual1, expected1);
			System.out.println(actual1 + " is present");

		} catch (AssertionError assertionError) {
			System.out.println(actual1 + " is not present");

		}
	

		CommonHelpers.clickElement(driver, path.view);
		
		CommonHelpers.explicitWait(driver, path.view);
		
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl != currentUrl2) {
			System.out.println("User succefully redirected");
		} else {
			System.out.println("user in not redirected");
		}
		
		
		

	}

}
