package com.webdriver.dayfour;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertDemo {

	WebDriver driver;
	@Test
	public void validateAlert() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\driver\\chromedriver.exe");
		driver = new ChromeDriver( options );
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		//Clicking on Alert producible button
		/*
		 * driver.findElement(By.name("submit")).click();
		 * 
		 * driver.switchTo().alert().accept();
		 * 
		 * driver.switchTo().alert().dismiss();
		 */
		
		//Switching the tabs
		
		((JavascriptExecutor) driver).executeScript("window.open()");
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		//driver.switchTo().window(tabs.get(0));
		driver.get("https://www.homedepot.com/");
		driver.switchTo().window(tabs.get(0));
		driver.switchTo().window(tabs.get(1)).close();
	}
}