package testng_scenarios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sbipopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
			driver=new ChromeDriver();		
		
        //Launching the site.				
            driver.get("https://www.onlinesbi.com");			
        driver.manage().window().maximize();	
             driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
  	  driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
  	  Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Forgot Login Password')]")).click();
        
       String MainWindow=driver.getWindowHandle();	
      	
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
            
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                               
                  new Select(driver.findElement(By.xpath("//select[@name='issueCode']"))).selectByVisibleText("Forgot Username");		
                 // Thread.sleep(2000);        
                //  driver.findElement(By.xpath("//input[@id='nextStep']")).click();
                  driver.findElement(By.name("nextStep")).click();
                  driver.findElement(By.name("cifno")).sendKeys("30156320145");
                  new Select(driver.findElement(By.name("countryCode"))).selectByVisibleText("India");
                 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                  driver.findElement(By.name("mobileNumber")).sendKeys("9885117732");
                  
                //CAPTCHA HANDLING   
                  Scanner scan=new Scanner(System.in);
                  System.out.println("enter captcha");
                  String captcha=scan.nextLine();
                  driver.findElement(By.name("captchaValue")).sendKeys(captcha);
                  Thread.sleep(7000);
                driver.findElement(By.name("Submit")).click();		
			// Closing the Child Window.
                        driver.close();//to close pop up window.		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
    }
        
        
	}


