package com.test.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Expedia_select {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Test Automation\\Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.expedia.com/");	
	  Thread.sleep(2000);
	  driver.findElement(By.id("tab-cruise-tab-hp")).click();
	  Thread.sleep(2000);
	  
	  ReusableMethods rm = new ReusableMethods();
	  rm.selectDropDown(driver, "cruise-destination-hp-cruise", "cuba");
	  Thread.sleep(3000);
	  rm.selectDropDown(driver, "cruise-departure-month-hp-cruise", "2019-02-01");
	  
	  
	  
//	  WebElement mySelectElement = driver.findElement(By.id("cruise-destination-hp-cruise"));
//	  Select dropdown= new Select(mySelectElement);
////	  dropdown.selectByIndex(4);
//	  dropdown.selectByValue("cuba");
	  System.out.println("test");
	  
  }
}
