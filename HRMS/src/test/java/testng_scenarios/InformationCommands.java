package testng_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class InformationCommands {
	public WebDriver driver;
  @Test
  public void printDisplaynames_tooltip() {

	 String str=driver.findElement(By.name("btnK")).getAttribute("value");
	 System.out.println(str);
	String str1=  driver.findElement(By.name("btnK")).getAttribute("class");
	System.out.println(str1);
	  String str2= driver.findElement(By.name("btnK")).getAttribute("type");
	  System.out.println(str2);
	 String str3= driver.findElement(By.name("btnK")).getAttribute("aria-label");
	 System.out.println(str3);
	 
	 String str4= driver.findElement(By.xpath("//a[contains(text(),'Advertising')]")).getText();
	 System.out.println(str4);
	 
	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.get("http://google.co.in");
  }

}
