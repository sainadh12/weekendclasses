package com.weekend.driver;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebDriverProvider {

	protected static WebDriver driver;
	protected static ExtentTest test;
	protected static ExtentReports report;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driverFrom) {
		driver = driverFrom;
		report = new ExtentReports("C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\ExtentReport.html");
	}
	
	public static void reportPass(String description) {
		test.log(LogStatus.PASS, description);
	}
	
	public static void reportFail(String description) {
		test.log(LogStatus.FAIL, description);
	}
}