package com.test.testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonTest {
	
	WebDriver driver;
	
  @Test
  public void loginAmazon() throws Exception {	  
	    Thread.sleep(3000);
	    driver.findElement(By.id("nav-link-accountList")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("ap_email")).sendKeys("Test@test.com");
	    driver.findElement(By.id("ap_password")).sendKeys("Tester123");
	    driver.findElement(By.id("signInSubmit")).click();
  }
  
  @Test 
  public void registerAmazon() throws Exception {	
	    System.out.println("Inside Register Amazon");
	    Thread.sleep(3000);
	    driver.findElement(By.id("nav-link-accountList")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("createAccountSubmit")).click();	    
  }
  
  @BeforeMethod
  public void launchBrowser() {	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");	
  }

  @AfterMethod
  public void closeApplication() {
	  driver.close();
	  driver.quit();
  }

}
