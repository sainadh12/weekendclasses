package com.webdriver.dayone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Costco {

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Costco costco = new Costco();
		costco.launchCostco();
		costco.signInValidation();
		//costco.closeDriver();
	}

	public WebDriver launchCostco(){

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://www.costco.com/");
		driver.get("https://www.costco.com/cooking-appliances.html");
		
		//Thread.sleep(3000);// Under milliseconds... so 3000 is 3 seconds wait time
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code-continue")));
		
		//Wait fluentWait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS);
		
		/*
		 * WebElement postalCodeContinueButton =
		 * driver.findElement(By.id("postal-code-continue"));
		 * postalCodeContinueButton.click();
		 */
		return driver;
	}

	public void signInValidation() throws InterruptedException {

		WebElement signInOrRegisterLink = driver.findElement(By.linkText("Sign In / Register"));
		signInOrRegisterLink.click();
		driver.findElement(By.id("logonId")).sendKeys("dummy@none.com");
		driver.findElement(By.id("logonPassword")).sendKeys("invalidpassword");
		driver.findElement(By.xpath("//label[@title='Remember Me']")).click();
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(10000);
		String errorMessage = driver.findElement(By.xpath("//div[@class='critical-notification form-group']"))
				.getText();
		if (errorMessage.contains("There was a problem with your information")) {
			System.out.println("Sorry Sign In was un-successful, please re-confirm your login details");
		}
	}
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
