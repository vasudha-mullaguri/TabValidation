package com.atmecs.Falcon.helpers;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.atmecs.Falcon.constants.FilePaths;

public class CommonHelpers {

	public static WebElement element;

	public static WebElement findElement(WebDriver driver, String locatorType, String locatorValue) {
		try {
			switch (locatorType) {
			case "Xpath":
				element = driver.findElement(By.xpath(locatorValue));
				break;
			case "Id":
				element = driver.findElement(By.id(locatorValue));
				break;
			case "Name":
				element = driver.findElement(By.name(locatorValue));
				break;
			case "CssSeletor":
				element = driver.findElement(By.cssSelector(locatorValue));
				break;
			case "LinkText":
				element = driver.findElement(By.linkText(locatorValue));
				break;
			case "PartialLinkText":
				element = driver.findElement(By.partialLinkText(locatorValue));
				break;
			case "TagName":
				element = driver.findElement(By.tagName(locatorValue));
				break;
			}
		} catch (NullPointerException e) {
			System.out.println("Element is not clicked");
		}
		return element;
	}

	public static List<WebElement> findElements(WebDriver driver, String elementPath) {
		List<WebElement> listOfElements = driver.findElements(By.xpath(elementPath));
		return listOfElements;
	}

	public static void clickElement(WebDriver driver, String element) throws InterruptedException {

		driver.findElement(By.xpath(element)).click();

	}

	public static String getTitleOfPage(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	public static void sendKeys(WebDriver driver, WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void moveOver(WebDriver driver, String elementPath) {
		WebElement mouseOver = driver.findElement(By.xpath(elementPath));
		Actions action = new Actions(driver);
		action.moveToElement(mouseOver).perform();
	}

	public static void explicitWait(WebDriver driver, String element) {
		WebDriverWait wait = new WebDriverWait(driver, FilePaths.page_load_timeout);
		WebElement element1;
		element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		element1.click();
	}

	public static void textvalidate(WebDriver driver, String xpath, String expected) {
		String actual = CommonHelpers.findElement(driver, "Xpath", xpath).getText();
		System.out.println(actual);
		System.out.println(expected);
		try {
			Assert.assertEquals(actual, expected);
			System.out.println("assertion passed:" + actual);
		} catch (AssertionError e) {
			System.out.println("Assertion failed" + e.getMessage());
		}
	}
	public static void validateImage(WebDriver driver,String xpath) {
		boolean imageStatus = CommonHelpers.findElement(driver, "Xpath", xpath).isDisplayed();
		try {
		Assert.assertEquals(imageStatus, true);
		System.out.println("image validated");
	}
		catch(AssertionError e) {
			System.out.println("Image not validated" +e.getMessage());
		}
	}
	public static List<WebElement> headervalidate(WebDriver driver, String path) {
		List<WebElement> allHeadersOfTable1 = driver.findElements(By.xpath(path));
		return allHeadersOfTable1;

	}

	public static void tooltip(WebDriver driver, String path,String attribute,String expectedAttribute) {
	String actualAttribute = driver.findElement(By.xpath(path)).getAttribute(attribute);
	try {
	Assert.assertEquals(actualAttribute, expectedAttribute);
	System.out.println(actualAttribute+" is found");
	}
	catch(AssertionError e) {
		System.out.println("Attribute not found"+e.getMessage());
	}
	}
}
