package com.test.testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample2 {
	
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @Test
  public void f() {
	  System.out.println("Test Method f");
  }

  @Test
  public void f1() {
	  System.out.println("Test Method F1");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

}
