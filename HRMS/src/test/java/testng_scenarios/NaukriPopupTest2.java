package testng_scenarios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NaukriPopupTest2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
			driver=new ChromeDriver();		
		
        //Launching the site.				
            driver.get("https://www.naukri.com");			
        driver.manage().window().maximize();	
        System.out.println(driver.getTitle());
          
        String MainWindow=driver.getWindowHandle();		
        System.out.println("main window id is:"+MainWindow);
		
        // To handle all new opened window.				
           Set<String> allwindows=driver.getWindowHandles();		
           int count=allwindows.size();
           System.out.println("all window id's are"+allwindows);
           System.out.println("total windows is"+count);
     ArrayList<String> tabs=new ArrayList<String>(allwindows);
     driver.switchTo().window(tabs.get(3));
     driver.findElement(By.xpath("//html//body//a//img")).click();
    // driver.close();
     driver.switchTo().window(tabs.get(2));
     driver.close();
     driver.switchTo().window(tabs.get(1));
   driver.close();
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);	
            System.out.println("main window title is:"+driver.getTitle());
    }
        
        

}
