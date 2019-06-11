package testng_scenarios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoitsample {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
		  driver=new ChromeDriver();
		driver.get("http://pdf2doc.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='pick-files']/span[2]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("F:\\Selenium8am\\HRMS\\pdf2doc.exe");
		
	}
	
}
