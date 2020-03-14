package com.atmecs.Falcon.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.Falcon.helpers.CommonHelpers;
import com.atmecs.Falcon.helpers.PageLocators;
import com.atmecs.Falcon.testsuite.BaseClass;

public class LoginPageTest extends BaseClass {
	
	public String actual;
	public String actual1;
	public String actual2;
	public String currentUrl;
	PageLocators path = new PageLocators();

	@Test
	public void locator() throws Exception {
		
		path.data();
		path.getValidationData();
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//System.out.println("test:"+path.dashboard);
		
		CommonHelpers.clickElement(driver, path.dashboard);
		
		//CommonHelpers.textvalidate(driver, path.dashtitle, path.val_dashtitle);
		
		//CommonHelpers.textvalidate(driver, path.restapitable, path.val_restapitable);
		//String actual=CommonHelpers.findElement(driver, "Xpath", path.restapitable).getText();
		//System.out.println(actual);
		CommonHelpers.textvalidate(driver, path.restapitable, path.val_restapitable);
		
		//CommonHelpers.validateImage(driver,path.restimage);
		
		
		CommonHelpers.textvalidate(driver, path.restapitext, path.valrest);
		
		//CommonHelpers.valtooltip(driver, path.tooltip_dashboard, "title", path.valtooltip_dash);
		
		//CommonHelpers.valtooltip(driver, path.rest_tooltip_bar, "uib-tooltip", path.val_rest_tooltip_bar);
		
		//CommonHelpers.valtooltip(driver, path.rest_tooltip_10, "uib-tooltip", path.val_rest_tooltip_10);
		
		//CommonHelpers.valtooltip(driver,path.rest_tooltip_90,"uib-tooltip" ,path.val_rest_tooltip_90);
		
		CommonHelpers.clickElement(driver, path.restapitext);
		
		CommonHelpers.explicitWait(driver, path.restapitext);
		
	//	CommonHelpers.textvalidate(driver, path.restapi_heading, path.val_restapi_heading)
		
		List <WebElement> listOptions = CommonHelpers.dropDown(driver, path.dropdown_customer, "Falcon");
		for(int count=0; count<listOptions.size(); count++) {
			System.out.println(listOptions.get(count).getText());
		}
		Assert.assertEquals(listOptions.get(0).getText(), "Select Customer");
		Assert.assertEquals(listOptions.get(1).getText(), "Falcon");
		
		
		//CommonHelpers.clickElement(driver, path.recentRuns);
		
		/*
		 * CommonHelpers.explicitWait(driver, path.recentRuns);
		 * 
		 * CommonHelpers.textvalidate(driver, path.recentRuns, path.val_resttitle);
		 * 
		 * 
		 * 
		 * CommonHelpers.clickElement(driver, path.view);
		 * 
		 * CommonHelpers.explicitWait(driver, path.view);
		 * 
		 * currentUrl = driver.getCurrentUrl(); System.out.println(currentUrl); if
		 * (currentUrl != currentUrl2) {
		 * System.out.println("User succefully redirected"); } else {
		 * System.out.println("user in not redirected"); }
		 */
		
	
		

	}

}
