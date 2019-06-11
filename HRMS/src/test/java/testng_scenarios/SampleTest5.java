package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;


/*Sample Testng Program contains multiple test methods with prioritization, ignoring the methods
 * using @ignore and enabled=false */

public class SampleTest5 {

  @Test(enabled = true)
  public void login() {
	  System.out.println("it is login method");
  }
  
  @Test(enabled = true,description = "it is for inbox method",dependsOnMethods = "login")
  public void inbox() {
	  System.out.println("it is inbox method");
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
