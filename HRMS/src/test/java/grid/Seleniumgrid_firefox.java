package grid;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;


//import com.opera.core.systems.OperaSettings.Capability;

public class Seleniumgrid_firefox {
	WebDriver driver;
	String baseUrl="https://opensource-demo.orangehrmlive.com";
	String nodeUrl="http://192.168.72.128:9876/wd/hub";
	String nodeUrl1="http://192.168.2.241:5678/wd/hub";
	
	 public void url_insertion() {
		  driver.get(baseUrl);
		  driver.manage().window().maximize();
		  Assert.assertEquals("OrangeHRM",driver.getTitle());
	  }
 
	 public void login() {
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  
		  //driver.quit();
		     
	  }
	 
 @Test()
  public void linux() 
  {
	  DesiredCapabilities capability = DesiredCapabilities.firefox(); // browser capability intitialization
		 capability.setBrowserName("firefox"); // browser name setup
		 capability.setPlatform(Platform.LINUX); // operating system initialization
	
		 try {
			driver=new RemoteWebDriver(new URL(nodeUrl),capability);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		url_insertion();
		login();
	}
  
  @Test()
	public void windows() {

        DesiredCapabilities capability1 = DesiredCapabilities.chrome(); // browser capability intitialization
		 capability1.setBrowserName("chrome"); // browser name setup
		 capability1.setPlatform(Platform.VISTA); // operating system initialization
		try {
			driver=new RemoteWebDriver(new URL(nodeUrl1),capability1);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		url_insertion();
		login();
	}
}

  
 