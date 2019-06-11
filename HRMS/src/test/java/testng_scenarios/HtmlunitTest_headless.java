package testng_scenarios;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeTest;

public class HtmlunitTest_headless {
	WebDriver driver;
	
  @Test(priority=0)
  public void browser() {
	  HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mindq systems");
		  String str= driver.getTitle();
		  System.out.println(str); 
		  
		String str1=driver.getCurrentUrl();
		System.out.println(str1);
		  }
  }
