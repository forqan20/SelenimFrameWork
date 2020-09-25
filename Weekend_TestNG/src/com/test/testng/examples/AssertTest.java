package com.test.testng.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
  @Test
  public void f() {
	  
	  
	    Assert.assertEquals(true, true);
	    Assert.assertEquals(true, false);
	    Assert.assertEquals(true, true);
  }
  
  @Test
  public void f1() {
	  
	  
	    Assert.assertEquals(true, true);
	    Assert.assertEquals(true, false);
	    Assert.assertEquals(true, true);
  }
  
}
