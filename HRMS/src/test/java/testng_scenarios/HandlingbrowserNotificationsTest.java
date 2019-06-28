package testng_scenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class HandlingbrowserNotificationsTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	 
	  ChromeOptions options=new ChromeOptions();
      options.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
			driver=new ChromeDriver(options);		
		
     //Launching the site.				
         driver.get("https://www.google.com/");
         driver.findElement(By.name("q")).sendKeys("swiggy");
         
        
  }
 

}
