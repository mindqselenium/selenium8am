package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


/*Sample Testng Program contains multiple test methods with prioritization*/

public class SampleTest3 {
  @Test(priority = 0)
  public void test3() {
	  System.out.println("it is test3 method");
  }
  
  @Test(priority = 1)
  public void test2() {
	  System.out.println("it is test2 method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("it is beforetest method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("it is aftertest method");
  }

}
