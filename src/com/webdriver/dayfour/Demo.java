package com.webdriver.dayfour;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo {
	
	WebDriver driver;
	ExtentTest test;
	ExtentReports report;
	
	@BeforeClass
	public void launchSetup() {
		
		report = new ExtentReports("C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\ExtentReport.html");
		test = report.startTest("Validating the HomeDepot Functionality");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\driver\\chromedriver.exe");
		driver = new ChromeDriver( options );
		driver.get("https://www.costco.com/");
	}
	//c# NUnit Python pyUNit 
	@Test(groups = "homepage validations")
	public void testHomeDepotFunc() {
		
		WebElement signInOrRegisterLink = driver.findElement(By.linkText("Sign In / Register"));
		signInOrRegisterLink.click();
		test.log(LogStatus.PASS, "Clicked on Sign In / Register link successfully");
		
		driver.findElement(By.id("logonId")).sendKeys("dummy@none.com");
		test.log(LogStatus.PASS, "Entered the value in logon text box");
		
		driver.findElement(By.id("logonPassword")).sendKeys("invalidpassword");
		test.log(LogStatus.PASS, "Entered the value in password text box");
		
		driver.findElement(By.xpath("//label[@title='Remember Me']")).click();
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String errorMessage = driver.findElement(By.xpath("//div[@class='critical-notification form-group']"))
				.getText();
		if (errorMessage.contains("There was a problem with your information")) {
			test.log(LogStatus.FAIL, "Sorry Sign In was un-successful, please re-confirm your login details");
		}
	}
	
	@AfterClass
	public void tearDown() {
		
		//Extent reports closing
		report.endTest(test);
		report.flush();
		
		driver.close();
		driver.quit();
	}
}
