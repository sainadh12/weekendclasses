package com.webdriver.daythree;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class HomeDepotHover {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		takeScreenShot("C://weekendclasses//afterDriverLaunch");
		driver.get("https://www.homedepot.com/");
		takeScreenShot("C://weekendclasses//afterHomeDepotLaunch");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		/*
		 * Actions action = new Actions(driver); WebElement element =
		 * driver.findElement(By.xpath(
		 * "//li[@class='ShoppingLinks__item']/a[@data-id='homeDecorFurniture']"));
		 * action.moveToElement(element).build().perform();
		 */
//""

	
		
		takeScreenShot("C://weekendclasses//hoverFunctionality");
		driver.quit();
	}

	public static void takeScreenShot(String filePath) {
		
		TakesScreenshot screenShot = ((TakesScreenshot)driver);

		SimpleDateFormat formatter = new SimpleDateFormat("ddMMYY-HHmmss");
		Date date = new Date();
		System.out.println();
		
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(filePath + formatter.format(date) + ".png");

		try {
			FileHandler.copy(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
