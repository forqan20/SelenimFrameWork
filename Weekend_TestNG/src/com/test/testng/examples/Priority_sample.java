package com.test.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_sample {
  
  WebDriver driver;

  @Test (priority = 0)
  public void launchApplication() {
	  System.out.println("Launching Application");
	  System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");	
  }
  
  @Test (priority = 1)
  public void checkHomePage() {
	  System.out.println("Home Page Verification ");
	  Assert.assertTrue(driver.findElement(By.id("nav-link-accountList")).isDisplayed());
	  
  }
  
  @Test (priority = 2)
  public void loginApplication() {
	  System.out.println("Login to Application");
  }

  @Test (priority = 3)
  public void closeApplication() {
	  System.out.println("Closing the Application");
	  driver.close();
	  driver.quit();
  }
  
  
  
}
