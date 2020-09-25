package com.test.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableMethods {
	
	
      public void selectDropDown(WebDriver driver,String element_id,String selectvalue) {
    	
    	  WebElement mySelectElement = driver.findElement(By.id(element_id));
    	  Select dropdown= new Select(mySelectElement);   	  
    	  dropdown.selectByValue(selectvalue);
    	  
    	  System.out.println("test");
    	  
      }

	

}
