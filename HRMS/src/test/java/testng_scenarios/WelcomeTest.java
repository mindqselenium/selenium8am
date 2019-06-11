package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class WelcomeTest {
  @Test
  public void f() {
	  System.out.println("welcome");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("bye");
  }

}
