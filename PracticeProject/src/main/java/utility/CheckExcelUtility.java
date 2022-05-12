package utility;

public class CheckExcelUtility {

	public static void main(String a[]) {
		ExcelSetup es =new ExcelSetup("C:\\Users\\SU20370349\\eclipse-workspace\\PracticeProject\\src\\main\\java\\TestData\\TestData.xlsx");
		int colcount = es.getColCount("sampledata");
		int rowcount = es.getRowCount("sampledata");
		System.out.println("column count is: "+colcount);
		System.out.println("row count is: "+rowcount);
	
	
	}
}
