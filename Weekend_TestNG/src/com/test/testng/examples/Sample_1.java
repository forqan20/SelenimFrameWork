package com.test.testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample_1 {
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside Before Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside Before Test");
  }
  
  @Test
  public void f() {
	  System.out.println("Inside Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside After Test ");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Inside After Class ");
  }
  
}
