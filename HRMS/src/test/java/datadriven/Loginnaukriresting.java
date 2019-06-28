package datadriven;
import java.io.FileInputStream;

//import jxl.Sheet;
//import jxl.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginnaukriresting {
	public WebDriver driver;
  @Test
  public void f() throws Exception{
	FileInputStream fi=new FileInputStream("F:\\Weekend_madhapur\\Automation\\testdata\\NAUKRI LOGIN TEST DATA.xlsx"); //path declaraton
	XSSFWorkbook workbook=new XSSFWorkbook(fi); //it will call fis location and open the workbook
	XSSFSheet sheet=workbook.getSheet("logindata");
		for (int i = 1; i<=sheet.getLastRowNum(); i++)
		{
		driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
		driver.findElement(By.name("email")).sendKeys((sheet.getRow(i).getCell(0).getStringCellValue()));
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys((sheet.getRow(i).getCell(1).getStringCellValue()));
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
		//driver.findElement(By.name("email")).sendKeys((sheet.getRow(i).getCell(0).getStringCellValue()));
		}
		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
		driver=new ChromeDriver(); // to launch chrome browser
	  driver.manage().window().maximize();
	  driver.get("http://www.naukri.com");
  }
}
