package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		//setting filepath, sheetname
		String filepath = System.getProperty("user.dir")+"\\testdata\\OrangeHRM_TestCases.xlsx";
		String sheetname = "hrm";
				
		File f = new File(filepath);
		FileInputStream is = new FileInputStream(f);
		
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		//create object bases on filetype
		if(filepath.endsWith(".xls"))
			wb = new HSSFWorkbook(is);
		else if(filepath.endsWith(".xlsx"))
			wb = new XSSFWorkbook(is);
		//accessing desired sheet
		sh = wb.getSheet("hrm");
		
		int nr = sh.getLastRowNum();
		//iterating over rows
		for(int i=1; i<nr; i++) {
			cell = sh.getRow(i).getCell(3);
			
			switch(cell.getCellType()) {
			
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "(Integer)\t");
					break;
				case STRING:
					System.out.print(cell.getStringCellValue() + "(String)\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + "(Boolean)\t");
					break;
				default:
					System.out.print("Unknown");
					break; 
			}
			System.out.println();	
		}
	
	
	
	}
	
}
