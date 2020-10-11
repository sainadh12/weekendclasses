package com.webdriver.daythree;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.webdriver.dayone.Costco;

public class TargetSite {

	static WebDriver driver;
	
	public static void main(String[] args) {

		Costco costco = new Costco();
		driver = costco.launchCostco();
		
		driver.get("https://www.target.com/c/produce-grocery/-/N-u7fty");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[@class='FooterButton__ButtonWrapper-mbwcwk-1 kVgmck']")));
	}
}
