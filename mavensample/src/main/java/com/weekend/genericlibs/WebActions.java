package com.weekend.genericlibs;

import com.weekend.driver.WebDriverProvider;

public class WebActions extends WebDriverProvider{
	
	public static void click(String objName) {
		
		getDriver().findElement(ORreader.getLocator(objName)).click();
	}
	
	public static void type(String objName, String valueToPass) {
		
		getDriver().findElement(ORreader.getLocator(objName)).sendKeys(valueToPass);
	}
}