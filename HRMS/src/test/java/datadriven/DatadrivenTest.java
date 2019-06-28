package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("F:\\Weekend_madhapur\\Automation\\testdata\\googlesearch.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis); //it will call fis location and open the workbook
		//XSSFSheet sheet=workbook.getSheet("Sheet1"); // it will open worksheet
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		for (int i=1;i<=sheet.getLastRowNum();i++){
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
						
		}
		
		
		
	}

}

