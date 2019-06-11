package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class InformationTest {
	WebDriver driver;
	
  @Test
  public void f() {
	 List<WebElement> str=new Select(driver.findElement(By.xpath("//select[@id='toll']"))).getOptions();
	// List<WebElement> str1 =new Select(driver.findElement(By.xpath("//select[@id='toll']"))).getOptions();
	System.out.println(str.size());
		 for (int i = 0; i < str.size(); i++) {
				 System.out.println(str.get(i).getText());
	 }
		 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.airindia.in/");
  }

  @AfterTest
  public void afterTest() {
  }

}
