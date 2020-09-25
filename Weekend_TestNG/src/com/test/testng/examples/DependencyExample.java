package com.test.testng.examples;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyExample {
 	
  WebDriver driver;	
  	 
  
  @Test
  public void openApplication() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.expedia.com/");	
	  Thread.sleep(2000);    
	  Assert.assertTrue(driver.findElement(By.id("tab-flight-tab-hp")).isDisplayed());	
	  Date d = new Date();
	  Reporter.log("Application is opened "+d);
  }
  
  @Test(dependsOnMethods= {"openApplication"})
  public void searchCruise() throws Exception {
	  
	  driver.findElement(By.id("tab-cruise-tab-hp")).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(driver.findElement(By.id("cruise-destination-hp-cruise")).isDisplayed());
	  ReusableMethods rm = new ReusableMethods();
	  rm.selectDropDown(driver, "cruise-destination-hp-cruise", "cuba");
	  Thread.sleep(3000);
	  rm.selectDropDown(driver, "cruise-departure-month-hp-cruise", "2019-02-01");
	  driver.findElement(By.xpath("//*[@id=\"gcw-cruises-form-hp-cruise\"]/div[3]/label/button")).click();
	  Thread.sleep(3000);	
	  Date d = new Date();
	  Reporter.log("Search Cruise is completed "+d);
  }
  
  @Test(dependsOnMethods= {"searchCruise"})
  public void closeApplication() throws Exception {
	  driver.close();
	  driver.quit();
	  Date d = new Date();
	  Reporter.log("Applicaiton is closed "+d);
	}
}
