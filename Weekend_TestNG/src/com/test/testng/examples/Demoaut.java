package com.test.testng.examples;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Demoaut {
	
  WebDriver driver;	
	
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Execution Started");
		System.out.println("Launch Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
  }
  
  @BeforeMethod
  public void launchBrowser() {

		driver = new ChromeDriver();
		driver.get("http://demoaut.com/");	
  }

  @Test
  public void RegisterUser() throws Exception {
		System.out.println("Register a User Started ");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("First Selenium");
		driver.findElement(By.name("lastName")).sendKeys("Selenium Last");
		driver.findElement(By.name("country")).sendKeys("TOGO");
	    driver.findElement(By.name("register")).click();
	    Thread.sleep(3000);			        
  }
  
  @AfterMethod
  public void afterMethod() {
	    driver.close();
	    driver.quit();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Execution Ended");
  }

}
