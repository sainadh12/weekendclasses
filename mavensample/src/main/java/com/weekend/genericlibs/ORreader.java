package com.weekend.genericlibs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ORreader {

	public static void main(String[] args) {
		
		getLocator("SignInButton");
	}
	
	static Properties props;
	static String propertiesPath = "C:\\Users\\Sainadh\\eclipse-workspace\\mavensample\\OR.properties";
	
	public static void readProperties() {
		
		try {
			FileReader propertiesFile = new FileReader(propertiesPath);
			props = new Properties();
			props.load(propertiesFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static By getLocator(final String logicalElementName) {
		
		readProperties();
		
		By valueElement = null;
		
		String locatorType = "";
		String locator = props.getProperty(logicalElementName);
		
		locatorType = locator.split(">")[0];
		
		String locatorValue = locator.split(">")[1];
		
		if(locatorType.toLowerCase().equals("id")) {
			valueElement = By.id(locatorValue);
		} else if(locatorType.toLowerCase().equals("name")) {
			valueElement = By.name(locatorValue);
		} else if(locatorType.toLowerCase().equals("xpath")) {
			valueElement = By.xpath(locatorValue);
		} else if(locatorType.toLowerCase().equals("linktext")) {
			valueElement = By.linkText(locatorValue);
		}
		return valueElement;
	}
}
