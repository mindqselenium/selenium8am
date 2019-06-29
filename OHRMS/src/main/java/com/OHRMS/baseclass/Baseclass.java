package com.OHRMS.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.OHRMS.util.Testutil;

public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	// this is baseclass constructor to declare fileinputstream class
	
	public Baseclass() throws IOException{
		
		prop=new Properties(); // to create propery file statements
	FileInputStream fip=new FileInputStream
			("F:\\Weekend_madhapur\\OHRMS\\src\\main\\java\\com\\OHRMS\\config\\config.properties");
	prop.load(fip); // to load config.properties file properly.
	
	}


public static void initialization(){
	String browsername=prop.getProperty("browser");
	
	if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM SOFTWARES 2017\\chromedriver1.exe");
		driver=new ChromeDriver();
	}

	else if(browsername.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM SOFTWARES 2017\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait
	           (Testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
		
}

//screenshot handling
	public void takescreenshot(String str) throws Exception{
		
		DateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss"); // date and time format specification
		Date d=new Date();// it will collect the current system date
		String time=df.format(d);
		System.out.println(time);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // to capture screenshot	
		//copy the screenshot from variable f to custom location.
		//FileUtils.copyFile(f, new File("E:\\SELENIUM WORKSPACE 2017\\SELENIUM 11 to 1PM\\OHRMS\\screenshots\\"+str+time+".png"));
		FileHandler.copy(f, new File("F:\\Weekend_madhapur\\OHRMS\\screenshots\\"+str+time+".png"));
	}
}

