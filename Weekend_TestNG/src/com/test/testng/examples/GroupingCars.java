package com.test.testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GroupingCars {

  @Test (groups = {"sedan","honda","best","hondasedan"})
  public void Accord() {	  
	    System.out.println("This is Sedan - Honda Accord");
  }
  
  @Test (groups = {"sedan","honda","best","hondasedan"})
  public void Civic() {	  
	    System.out.println("This is Sedan - Honda civic");
  }
  
  @Test (groups = {"sedan","audi"})
  public void A4() {	  
	    System.out.println("This is Sedan - Audi A4");
  }
  
  @Test (groups = {"sedan","bmw"}) 
  public void BMW328() {	  
	    System.out.println("This is Sedan - BMW328");
  }
  
  @Test (groups = {"suv","honda"})
  public void CRV() {	  
	    System.out.println("This is SUV - Honda CRV");
  }
  
  @Test (groups = {"suv","audi"})
  public void Q5() {	  
	    System.out.println("This is SUV - Audi Q5");
  }
  
  @Test (groups = {"suv","bmw"})
  public void X5() {	  
	    System.out.println("This is SUV - BMW X5");
  }

  @Test (groups = {"truck","tesla","best"})
  public void TeslaTruck() {	  
	    System.out.println("This is Truck - Tesla");
  }

}
