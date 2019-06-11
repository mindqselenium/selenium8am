package junit_Scenarios;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample3 {

	
	@BeforeClass
	public static void setUp() throws Exception {
		System.out.println("it is setup method");
	
	}

	@AfterClass
	public static void tearDown() throws Exception {
		System.out.println("it is teardown method");
	}

	@Test
	public void test1() {
		System.out.println("it is test1 method");
	}
   @Test
   @Ignore 
	public void test() {
		System.out.println("it is test method");
	}
}
