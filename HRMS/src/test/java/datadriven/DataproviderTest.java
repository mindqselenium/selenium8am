package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DataproviderTest {

	private static WebDriver driver;

  @DataProvider(name = "Authentication")

  public static Object[][] credentials() 
        {

        return new Object[][] { 
        	{ "mindq@gmail.com",    "Test@123" }, 
        	{ "selenium@gmail.com", "Test@123" },
        	{ "ameerpet@gmail.com",  "test@345"},
        	{ "manual@gmail.com",    "test@123"}
        	};

          }
  
  @BeforeTest
  public void browser(){
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.fb.com");

  }

  // Here we are calling the Data Provider object with its Name

  @Test(dataProvider = "Authentication")

  public void test(String sUsername, String sPassword) {

	  
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.findElement(By.id("email")).clear();
      driver.findElement(By.id("email")).sendKeys(sUsername);
      driver.findElement(By.id("pass")).clear();
      driver.findElement(By.id("pass")).sendKeys(sPassword);

    //  driver.quit();

  }

}