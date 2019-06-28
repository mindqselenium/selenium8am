package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoNewExcel {

	public static void main(String[] args) throws Exception {
		
		String filepath = System.getProperty("user.dir")
									+"\\testdata\\OrangeHRM_TestCases_New3.xlsx";
		//create workbook				
		File f = new File(filepath);
		
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		
		if(filepath.endsWith(".xls"))
			wb = new HSSFWorkbook();
		else if(filepath.endsWith(".xlsx"))
			wb = new XSSFWorkbook();
		
		//create sheet
		sh = wb.createSheet("TestSheet");
		
		for(int i=0; i<10; i++) {
			//create row
			row = sh.createRow(i);
			
			for(int j=0; j<10; j++) {
				//create cell
				cell = row.createCell(j);
				//set cell data
				cell.setCellValue("Test"+i+j);
			}			
		}
		
		FileOutputStream os = new FileOutputStream(f);
		wb.write(os);
		wb.close();
	}
}
