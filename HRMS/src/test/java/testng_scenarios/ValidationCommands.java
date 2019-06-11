package testng_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class ValidationCommands {
	public WebDriver driver;
   
  @Test(description="Verify the functionality of oneway radio button")
  public void verifyOnewaySearch() {
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	//input[@id='ctl00_mainContent_rbtnl_Trip_1']
	  
	//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
if(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled())
{
	System.out.println("Available");
}else{
	System.out.println("Not available");
}

/*String id="ctl00_mainContent_txt_Todate";
Assert.assertEquals(driver.findElement(By.id(id)).isDisplayed(),false);
Assert.assertEquals(driver.findElement(By.id(id)).isDisplayed(),true);*/
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
			driver=new ChromeDriver();
	  driver.get("http://spicejet.com");
  }

}
