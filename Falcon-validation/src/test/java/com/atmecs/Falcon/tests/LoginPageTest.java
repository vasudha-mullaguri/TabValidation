package com.atmecs.Falcon.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.By;



import com.atmecs.Falcon.helpers.CommonHelpers;
import com.atmecs.Falcon.helpers.PageLocators;
import com.atmecs.Falcon.testsuite.BaseClass;




public class LoginPageTest extends BaseClass {
	Properties property;
	public String actual;
	public String actual1;
	public String currentUrl;
	PageLocators path=new PageLocators();
    @Test
	public void locator() throws Exception {
        path.data();
        String currentUrl2 = driver.getCurrentUrl();
        System.out.println(currentUrl2);
	 CommonHelpers.clickElement(driver,path.getDashboard());
	 	 actual=driver.findElement(By.xpath(path.getDashboardele())).getText(); 
	 	 System.out.println(actual);
	 	 String expected = "Dashboard";
			 Assert.assertEquals(actual,expected);
			 System.out.println(actual  +" is present");
			 
	 
	  CommonHelpers.clickElement(driver, path.getRecentRuns());
	  CommonHelpers.explicitWait(driver,"//span[text()='Recent Runs']");
	  actual1=driver.findElement(By.xpath(path.getRecentRuns())).getText();
	 	 System.out.println(actual1);
	 	 String expected1 = "Recent Runs";
		 try {
			 Assert.assertEquals(actual1,expected1);
			 System.out.println(actual1  +" is present");
			 
			 } catch (AssertionError assertionError) {
			 System.out.println(actual1  +" is not present");
			 
			 }
	  
	 CommonHelpers.clickElement(driver, path.getView());
	 CommonHelpers.explicitWait(driver,"//span[text()='View']");
	  currentUrl = driver.getCurrentUrl();
	 System.out.println(currentUrl);
	 if(currentUrl!=currentUrl2)
	 {
		 System.out.println("User succefully redirected");
	 }
	 else
	 {
		 System.out.println("user in not redirected");
	 }
	}
	

}
