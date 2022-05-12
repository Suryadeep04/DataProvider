package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelSetup {

		XSSFWorkbook wb;
		XSSFSheet sheet;
	public ExcelSetup(String filepath) {
		
		try {
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
	
	public String getExceldata(String sheetname, int row, int column) {
		
		sheet = wb.getSheet(sheetname);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int getRowCount(String sheetname) {
		int rowCount =wb.getSheet(sheetname).getLastRowNum();
		rowCount = rowCount+1;
		return rowCount;
	}
	
	public int getColCount(String sheetname) {
		int colCount =wb.getSheet(sheetname).getRow(0).getLastCellNum();
		return colCount;
	}

}