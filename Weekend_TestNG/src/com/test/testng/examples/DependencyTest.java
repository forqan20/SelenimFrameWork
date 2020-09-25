package com.test.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyTest {
  WebDriver driver;
  
  @Test
  public void openApplication() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://overview.mail.yahoo.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();	  
		Reporter.log("Open Application is completed");
  }
  
  @Test(dependsOnMethods = {"openApplication"})
  public void loginApplication() throws Exception {
      Thread.sleep(3000);
  	  driver.findElement(By.id("login-username")).sendKeys("tester1234");
  	  driver.findElement(By.id("login-signin")).click();
  	  Reporter.log("Login Application is Completed");
  }

  @Test(dependsOnMethods = {"loginApplication"})
  public void closeApplication() throws Exception {
	  driver.close();
	  driver.quit();
	  Reporter.log("Close Application is Completed");
	  Reporter.log("close Application ", true);

  }
     
}
