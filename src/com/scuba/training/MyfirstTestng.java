package com.scuba.training;

import org.testng.annotations.Test;

public class MyfirstTestng {
  @Test(priority=1, description="First run")
  public void testngsampleone() {
	  
	  System.out.println("My First TestNG....one");
  }
  
  @Test(priority=2, description = "Second run")
  public void testngsampletwo() {
	  
	  System.out.println("My First TestNG....two");
  }
  
  @Test(priority=3, description = "Third run")
  public void testngsamplethree() {
	  
	  System.out.println("My First TestNG....three");
  }
  
  @Test//(priority=4,description="Fourth run")
  public void testngsamplefour() {
	  
	  System.out.println("My First TestNG....four");
  }
}
