package com.weekend.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TargetDefinitions {

	WebDriver driver;
	@Given("I have launched web browser and navigated to Target website")
	public void i_have_launched_web_browser_and_navigated_to_target_website() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
	}

	@Given("I have clicked on Registry link")
	public void i_have_clicked_on_registry_link() {
		driver.findElement(By.linkText("Registry")).click();
	}

	@Then("I validate the Registry page")
	public void i_validate_the_registry_page() {
		driver.close();
		driver.quit();
	}
	
	@Given("I have launched {string} in browser")
	public void i_have_launched_in_browser(String website) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sainadh\\eclipse-workspace\\WeekendClasses\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(website);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
	}
}
