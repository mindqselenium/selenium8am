package testng_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FrameshandlingTest {
	WebDriver driver;
	
  @Test
  public void Framehandling() {
	 driver.switchTo().frame(2); /* if frame contains index use this*/
	 // driver.switchTo().frame("name"); /* if frame contains name use this*/
	  driver.findElement(By.linkText("IDEA")).click();
	  driver.switchTo().defaultContent();/* to switch back to main window*/
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("C:\\Users\\sudheer\\Desktop\\frames.html");
	//By executing a java script
	  JavascriptExecutor exe = (JavascriptExecutor) driver;
	  Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	  System.out.println("Number of iframes on the page are " + numberOfFrames);
	  
	  //By finding all the web elements using iframe tag
	  List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	  System.out.println("The total number of iframes are " + iframeElements.size());
  }

  @AfterTest
  public void afterTest() {
  }

}
