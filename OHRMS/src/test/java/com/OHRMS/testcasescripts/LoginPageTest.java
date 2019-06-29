package com.OHRMS.testcasescripts;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OHRMS.Pages.Dashboardpage;
import com.OHRMS.Pages.LoginPage;
import com.OHRMS.baseclass.Baseclass;
import com.OHRMS.util.Testutil;

//import Academy.HomePage;

public class LoginPageTest extends Baseclass {

	
	com.OHRMS.Pages.HomePage hp;
	LoginPage lp;
	private String loginpageimg;
   
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws Exception{
		
		initialization();
		lp=new LoginPage();	//login page initialization
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=lp.validateloginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
		}
	

	@Test(priority=2)
	public void LoginTest() throws Exception{
		
		takescreenshot("loginpageimg");
		hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	

	@AfterTest
	public void teardown(){
		//driver.quit();
	}
}
