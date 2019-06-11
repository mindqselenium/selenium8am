package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/*Sample Testng Program*/

public class SampleTest {
  @Test
  public void f() {
	  System.out.println("it is test method");
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
