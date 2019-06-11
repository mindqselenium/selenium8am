package testng_scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class AjaxControl2 {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mindq systems");// to insert data in google search page
	  Thread.sleep(2000);// it is a page refresh command and waits for 2 seconds
String str=driver.findElement(By.xpath("//div[@class='A8SBwf emcav']")).getText();

System.out.println(str);
String s[]=str.split("\n"); // variable length array, so that array memory allocated based on input
System.out.println(s.length); // to find the array length
for (int i = 0; i < s.length; i++) 
{
	if(s[i].equalsIgnoreCase("mindq systems sr nagar"))
	{
	System.out.println(s[i]);
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
	 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(s[i]);
		
	}
}	
	
  }
  @BeforeTest 
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
		driver=new ChromeDriver();		
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void aftertest(){
	  //driver.quit();
  }

}






