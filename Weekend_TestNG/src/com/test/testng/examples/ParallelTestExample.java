package com.test.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestExample {
	  
  @org.testng.annotations.Parameters({"browsertype"})  
  @Test
  public void demoLogin(String browsertype) throws InterruptedException {
	  
	  WebDriver driver = null;
	  
	  switch (browsertype) {
			case "chrome":
				     System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
				     driver = new ChromeDriver();				   				
				     break;
			case "firefox": 		     
 				     System.setProperty("webdriver.firefox.marionette", "C:\\Test Automation\\Jars\\geckodriver.exe");
				     driver = new FirefoxDriver();
				     break;
			case "ie":		     
				     System.setProperty("webdriver.ie.driver", "C:\\Test Automation\\Jars\\IEDriverServer.exe");
				     driver = new InternetExplorerDriver();
                     break;  		     
			default:
				     System.out.println("Unsupported Browser");
				     break;
	     }
	    	  
	  driver.get("http://demoaut.com/");	
	  Thread.sleep(2000);  
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  Thread.sleep(2000);  
	  driver.findElement(By.name("userName")).sendKeys("tester");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();	  
	  driver.close();
	  driver.quit();	  	  

  }
}
