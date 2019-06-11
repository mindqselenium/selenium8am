package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class GroupsTest {
  @Test(groups = "smoketest")
  public void login() {
	  System.out.println("this is login test method");
	  
  }
  @Test(groups = "regressiontest")
  public void inbox() {
	  System.out.println("this is inbox test method");
  }
  @Test(groups = "smoketest")
  public void test1() {
	  System.out.println("this is smoke test1 method");
  }
  @Test(groups = "sanitytest")
  public void test9() {
	  System.out.println("this is sanity test method");
  }
  @Test(groups = "regressiontest")
  public void test7() {
	  System.out.println("this is regression test method");
  }
  @Test(groups = "smoketest")
  public void test10() {
	  System.out.println("this is smoke test10 method");
  }
  @Test(groups = "regressiontest")
  public void test11() {
	  System.out.println("this is regression test method");
  }

}
