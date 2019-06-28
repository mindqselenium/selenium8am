package testng_scenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AuthenticationPopUpTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
			driver=new ChromeDriver();		
		
     //Launching the site.				
         driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
         String str=driver.findElement(By.cssSelector("p")).getText();
         System.out.println(str);
         Thread.sleep(2000);
         driver.navigate().back();
  }
 

}
