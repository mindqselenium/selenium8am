package junit_Scenarios;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Sample.class, Sample2.class, Sample3.class })
public class AllTests {

}
