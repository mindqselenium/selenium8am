package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public Workbook wb;
	public Sheet sh; 
	public Row row;
	public Cell cell;
	
	public void setExcelFile(String filepath) throws Exception {

		try {
		
			File f = new File(filepath);
			FileInputStream is = new FileInputStream(f);
			if(filepath.endsWith(".xls"))
				wb = new HSSFWorkbook(is);
			else if(filepath.endsWith(".xlsx"))
				wb = new XSSFWorkbook(is);

		} catch (Exception e){
				throw (e);
		}
	}
	
	public int getRowCount(String sheetName){
		
		sh = wb.getSheet(sheetName);
		int number=sh.getLastRowNum()+1;
		
		return number;
	}

	public int getColumnCount(String sheetname, int rownum){

		sh= wb.getSheet(sheetname);
		row = sh.getRow(rownum);
		
		return row.getLastCellNum();

	}
	
	public String getCellData(String sheetname, int RowNum, int ColNum) throws Exception{

		String CellData = "";
		
		try{
				sh=wb.getSheet(sheetname);
				row = sh.getRow(RowNum); 
				cell = row.getCell(ColNum);
				
				switch(cell.getCellType()) {
				
					case NUMERIC:
						CellData = String.valueOf(cell.getNumericCellValue());
						break;
					case STRING:
						CellData = cell.getStringCellValue();
						break;
					default:
						System.out.print("Unknown");
						break; 
				}
				
				return CellData;
	
			}catch (Exception e){
					return "";
			}
	}
		
	public void setCellData(String filepath, String sheetname, String data,  int RowNum, int ColNum) throws Exception	{
		
	try{
			sh = wb.getSheet(sheetname);
			row  = sh.getRow(RowNum);
			cell = row.getCell(ColNum);

			if (cell == null) {
				cell = row.createCell(ColNum);
				cell.setCellValue(data);
			
			} else {
				cell.setCellValue(data);
			}

		FileOutputStream fileOut = new FileOutputStream(filepath);
	
		wb.write(fileOut);
		fileOut.close();

		}catch(Exception e){
			
		}	

	}

}






















