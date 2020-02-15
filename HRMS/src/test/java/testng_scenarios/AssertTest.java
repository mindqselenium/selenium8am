package testng_scenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class AssertTest {
	WebDriver driver;
	
  @Test
  public void login() {
	  System.out.println("this is login");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.get("https://www.seleniumhq.org");
			driver.manage().window().maximize();
			Assert.assertEquals("Selenium - Web Browser Automation", driver.getTitle());
		

  }

}
