package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Iterator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		String filepath = System.getProperty("user.dir")+"\\testdata\\ReadExcelData.xlsx";
		String sheetname = "test";
				
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
		Iterator<Row> rowIte = sh.iterator();
		//to iterate among rows
		while(rowIte.hasNext()) {
			Iterator<Cell> cellIte = rowIte.next().iterator();
			//to iterate among cells
			while(cellIte.hasNext()) {
				cell = cellIte.next();
				
				switch(cell.getCellTypeEnum()) {
				
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
			}
			System.out.println();
		}
	}
}
