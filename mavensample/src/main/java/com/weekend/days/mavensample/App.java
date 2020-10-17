package com.weekend.days.mavensample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.weekend.genericlibs.DataReader;

public class App extends DataReader
{
	static WebDriver driver;
	
	@BeforeClass
	public void launchSetup() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		setDriver(driver);
		getDriver().get(getData("URL"));
		test = report.startTest("Validating the HomeDepot Functionality");
	}
	
	@Test
    public void test()
    {
		click("RegisterLink");
		reportPass("Clicked on Registry link");
		reportFail("Unable to click on Registry link");
    }
	
	@AfterClass
	public void tearDown() {
		report.endTest(test);
		report.flush();
		driver.close();
		driver.quit();
	}
}
