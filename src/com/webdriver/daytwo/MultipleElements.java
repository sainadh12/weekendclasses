package com.webdriver.daytwo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriver.dayone.Costco;

public class MultipleElements {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		Costco costco = new Costco();
		driver = costco.launchCostco();
		
		/*
		 * List<WebElement> elements =
		 * driver.findElements(By.xpath("//div[@class='footer-items row gutter']//a"));
		 * System.out.println("Total number of web elements is "+elements.size());
		 * 
		 * for(WebElement singleElement : elements)
		 * System.out.println("\n"+singleElement.getText());
		 */
		
		List<WebElement> listOfProducts = driver.findElements(By.xpath("//div[@id='search-results']//span[@class='description']/a"));
		
		for(WebElement singleProduct : listOfProducts) {

			String productName = singleProduct.getText();
			singleProduct.click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//WebDriverWait wait = new WebDriverWait(driver, 100);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//dd[@class='bv-rating-ratio-number']//a")));
			WebElement rating = driver.findElement(By.xpath("//dd[@class='bv-rating-ratio-number']//a"));
			String ratingText = rating.getText();
			System.out.println(productName+ " item number is  " + driver.findElement(By.xpath("//span[@id='item-no']")).getText()+" and Rating is "+ratingText);
			//System.out.println("\n"+singleProduct.getText());
			driver.navigate().back();
		}
		
	}
}
