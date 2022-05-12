package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
	public static void main(String[] args) {

		try {
		File fi = new File("C:\\Users\\SU20370349\\eclipse-workspace\\PracticeProject\\src\\main\\java\\TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(fi);
		wb = new XSSFWorkbook(fis);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		sheet = wb.getSheetAt(0);
		String cellvalue = sheet.getRow(0).getCell(0).getStringCellValue();
	
		System.out.println(cellvalue);
	
	}
	
}
