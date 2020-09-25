package com.test.testng.examples;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParamExamples {

  @Test
  public void searchFlights() throws Exception {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.expedia.com/");	
	  Thread.sleep(2000);    
	  Assert.assertTrue(driver.findElement(By.id("tab-flight-tab-hp")).isDisplayed());	
	  Date d = new Date();
	  Reporter.log("Application is opened "+d);
	  driver.findElement(By.id("tab-flight-tab-hp")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Washington, DC (WAS-All Airports)");
	  driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("San Francisco, CA (SFO-San Francisco Intl.)");
//	  driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button")).click();
	  Thread.sleep(3000);  	
	  driver.close();
	  driver.quit();
  }
}
