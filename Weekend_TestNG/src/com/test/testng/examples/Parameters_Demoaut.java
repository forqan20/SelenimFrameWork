package com.test.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Demoaut {
	
  @org.testng.annotations.Parameters({"firstname","password"})  
  @Test 
  public void demoLogin(String firstname,String password) throws Exception {	
	  System.out.println("First name is "+firstname);
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demoaut.com/");	
	  Thread.sleep(2000);  
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  Thread.sleep(2000);  
	  driver.findElement(By.name("userName")).sendKeys(firstname);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("login")).click();	  
	  driver.close();
	  driver.quit();	  	  
  }
}
