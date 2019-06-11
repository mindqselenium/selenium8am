package junit_Scenarios;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample {

	@Before
	public void setUp() throws Exception {
		System.out.println("it is setup method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("it is teardown method");
	}

	@Test
	public void test() {
		System.out.println("it is test method");
	}

}
