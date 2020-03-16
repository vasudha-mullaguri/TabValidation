package com.atmecs.Falcon.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.Falcon.constants.FilePaths;
import com.atmecs.Falcon.helpers.CommonHelpers;
import com.atmecs.Falcon.helpers.PageLocators;
import com.atmecs.Falcon.testsuite.BaseClass;
import com.atmecs.Falcon.utils.ReadProperties;
import com.google.j2objc.annotations.Property;

public class LoginPageTest extends BaseClass {
	
	public String actual;
	public String actual1;
	public String actual2;
	public String currentUrl;
	Properties property;
	Properties property1;
	PageLocators path = new PageLocators();

	@Test
	public void locator() throws Exception {
		
		path.data();
		path.getValidationData();
		property=ReadProperties.loadProperty(FilePaths.LOGIN);
		property1=ReadProperties.loadProperty(FilePaths.VALIDATION);
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//System.out.println("test:"+path.dashboard);
		
		CommonHelpers.clickElement(driver, path.dashboard);
		
		//CommonHelpers.textvalidate(driver, path.dashtitle, path.val_dashtitle);
		
		//CommonHelpers.textvalidate(driver, path.restapitable, path.val_restapitable);
		//String actual=CommonHelpers.findElement(driver, "Xpath", path.restapitable).getText();
		//System.out.println(actual);
		//CommonHelpers.textvalidate(driver, path.restapitable, path.val_restapitable);
		
		//CommonHelpers.validateImage(driver,path.restimage);
		
		
		//CommonHelpers.textvalidate(driver, path.restapitext, path.valrest);
		
		//CommonHelpers.valtooltip(driver, path.tooltip_dashboard, "title", path.valtooltip_dash);
		
		//CommonHelpers.valtooltip(driver, path.rest_tooltip_bar, "uib-tooltip", path.val_rest_tooltip_bar);
		
		//CommonHelpers.valtooltip(driver, path.rest_tooltip_10, "uib-tooltip", path.val_rest_tooltip_10);
		
		//CommonHelpers.valtooltip(driver,path.rest_tooltip_90,"uib-tooltip" ,path.val_rest_tooltip_90);
		
		CommonHelpers.clickElement(driver, path.restapitext);
		
		CommonHelpers.explicitWait(driver, path.restapitext);
		
		//CommonHelpers.textvalidate(driver, path.restapi_heading, path.val_restapi_heading);
		
	
		
		//CommonHelpers.clickElement(driver, path.dropdown_customer);
		CommonHelpers.explicitWait(driver, path.dropdown_customer);
		
		CommonHelpers.clickElement(driver, property.getProperty("loc_dashboard_click"));
		

		//validating-select customer
		CommonHelpers.dropDown(driver, path.dropdown_customer, "Falcon");
		

		List<WebElement> listOptions=CommonHelpers.headervalidate(driver, property.getProperty("loc_restapi_table"));
		for(int count=0; count<listOptions.size(); count++) {
			System.out.println("list for customer_falcon:"+listOptions.get(count).getText());
		}
		
		CommonHelpers.tablevalidation(driver,listOptions.get(0).getText() , property.getProperty("val.restapitable1"));
		CommonHelpers.tablevalidation(driver,listOptions.get(1).getText() , property.getProperty("val.restapitable2"));
		CommonHelpers.tablevalidation(driver,listOptions.get(2).getText() , property.getProperty("val.restapitable3"));
		CommonHelpers.tablevalidation(driver,listOptions.get(3).getText() , property.getProperty("val.restapitable4"));
		CommonHelpers.tablevalidation(driver,listOptions.get(4).getText() , property.getProperty("val.restapitable5"));
		CommonHelpers.tablevalidation(driver,listOptions.get(5).getText() , property.getProperty("val.restapitable6"));
		CommonHelpers.tablevalidation(driver,listOptions.get(6).getText() , property.getProperty("val.restapitable7"));
		CommonHelpers.tablevalidation(driver,listOptions.get(7).getText() , property.getProperty("val.restapitable8"));
		CommonHelpers.tablevalidation(driver,listOptions.get(8).getText() , property.getProperty("val.restapitable9"));
		CommonHelpers.tablevalidation(driver,listOptions.get(9).getText() , property.getProperty("val.restapitable10"));
		
		//validating-module
		CommonHelpers.dropDown(driver, path.dropdown_module, "createFalconPosts");
		
		CommonHelpers.explicitWait(driver,path.dropdown_module);
		//validating-status_pass
		CommonHelpers.dropDown(driver, path.dropdown_status_pass, "Pass");
		
		CommonHelpers.explicitWait(driver, path.dropdown_status_pass);
		
		Thread.sleep(1000);
		List<WebElement> listOptions1=CommonHelpers.headervalidate(driver, property.getProperty("loc_restapi_table"));
		for(int count1=0; count1<listOptions1.size(); count1++) {
			System.out.println("list for status_pass:"+listOptions1.get(count1).getText());
		}
	
		CommonHelpers.tablevalidation(driver,listOptions1.get(0).getText() , property.getProperty("val.restapitable1"));
		CommonHelpers.tablevalidation(driver,listOptions1.get(1).getText() , property.getProperty("val.restapitable2"));
		CommonHelpers.tablevalidation(driver,listOptions1.get(2).getText() , property.getProperty("val.restapitable3"));
		CommonHelpers.tablevalidation(driver,listOptions1.get(3).getText() , property.getProperty("val.restapitable4"));
		CommonHelpers.tablevalidation(driver,listOptions1.get(4).getText() , property.getProperty("val.restapitable6"));
		CommonHelpers.tablevalidation(driver,listOptions1.get(5).getText() , property.getProperty("val.restapitable7"));
		CommonHelpers.tablevalidation(driver,listOptions1.get(6).getText() , property.getProperty("val.restapitable8"));
		CommonHelpers.tablevalidation(driver,listOptions1.get(7).getText() , property.getProperty("val.restapitable9"));
		CommonHelpers.tablevalidation(driver,listOptions1.get(8).getText() , property.getProperty("val.restapitable10"));
		
		CommonHelpers.dropDown(driver, path.dropdown_status_fail, "Fail");
		CommonHelpers.explicitWait(driver,path.dropdown_status_fail );
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> listOptions3=CommonHelpers.headervalidate(driver, property.getProperty("loc_restapi_table"));
		for(int count2=0; count2<listOptions3.size(); count2++) {
			System.out.println("failed:"+listOptions3.get(count2).getText());
		}
		CommonHelpers.tablevalidation(driver, listOptions3.get(0).getText(),property.getProperty("val.restapitable5"));
		
		//validating-status_skip
		CommonHelpers.dropDown(driver,path.dropdown_status_skip, "Skip"); 
		
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
		
		

	
		


