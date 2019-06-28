package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		String filepath = System.getProperty("user.dir")+"\\testdata\\OrangeHRM_TestCases.xlsx";
		String sheetname = "hrm1";
				
		File f = new File(filepath);
		FileInputStream is = new FileInputStream(f);
		
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		
		if(filepath.endsWith(".xls"))
			wb = new HSSFWorkbook(is);
		else if(filepath.endsWith(".xlsx"))
			wb = new XSSFWorkbook(is);
		
		sh = wb.getSheet(sheetname);
		
		System.out.println(sh.getLastRowNum()+1);
		
		row = sh.getRow(3);
		cell = row.getCell(2);
		System.out.println(cell.getStringCellValue());
	}

}
