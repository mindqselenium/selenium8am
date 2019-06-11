package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/*Sample Testng Program contains multiple test methods*/

public class SampleTest2 {
  @Test
  public void test3() {
	  System.out.println("it is test3 method");
  }
  
  @Test
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
