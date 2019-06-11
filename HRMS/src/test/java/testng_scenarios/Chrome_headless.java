package testng_scenarios;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeTest;

public class Chrome_headless {
	WebDriver driver;
	
	/* screenshot logic declaring globally to access anywhere in the test methods*/
	
	public void takescreenshot(String str2) throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("F:\\Selenium8am\\HRMS\\screenshot\\"+str2+".jpg"));
	}
	
  @Test(priority=0)
  public void browser() throws IOException {
	System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions(); // chromeoptions class initialization
	options.addArguments("1300,800"); // specifiying browser window size, i.e height and width
	options.addArguments("headless"); // specifying mode of execution with headless
   driver=new ChromeDriver(options); // chromedriver initialization by passing options parameter.
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mindq systems");
		  String str= driver.getTitle();
		  System.out.println(str); 
		  
		String str1=driver.getCurrentUrl();
		System.out.println(str1);

		takescreenshot("browser"); // calling takescreenshot method in @test method
		
		
		
		
		  }
  }
