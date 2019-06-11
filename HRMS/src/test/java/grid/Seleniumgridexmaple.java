package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Seleniumgridexmaple {
	WebDriver driver;
	String baseUrl,nodeUrl;
	
	public void setup () 
	  {
		 baseUrl="http://www.newtours.demoaut.com/";
		 nodeUrl="http://192.168.2.241:5678/wd/hub";
	// System.setProperty("webdriver.chrome.driver","E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
//			driver=new ChromeDriver();
		 DesiredCapabilities capability = DesiredCapabilities.chrome(); // browser capability intitialization
		 capability.setBrowserName("chrome"); // browser name setup
		 capability.setPlatform(Platform.VISTA); // operating system initialization
		 try {
			driver=new RemoteWebDriver(new URL(nodeUrl),capability);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// Thread.sleep(10000);
		 }

public void simpletest() {
	  driver.get(baseUrl);
	  Assert.assertEquals("Welcome: Mercury Tours",driver.getTitle());
}

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		Seleniumgridexmaple s=new Seleniumgridexmaple();
		s.setup();
		s.simpletest();
	}
	}
