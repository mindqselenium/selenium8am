package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;


/*Sample Testng Program contains multiple test methods with prioritization, ignoring the methods
 * using @ignore and enabled=false */

public class SampleTest4 {

  @Test(priority = 0)
  public void test3() {
	  System.out.println("it is test3 method");
  }
  @Ignore
  @Test(priority = 1,enabled = true,description = "it is for login method")
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
