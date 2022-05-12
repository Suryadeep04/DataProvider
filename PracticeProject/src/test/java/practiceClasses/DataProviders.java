package practiceClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelSetup;

public class DataProviders {

	
	@Test(dataProvider = "DataProvider")
	public void harddataprovider(String a,String b) {
		System.out.println(a+" "+b);
	}
	
	
	
	@DataProvider(name="DataProvider")
	public Object[][] dataprovider(){
		
		ExcelSetup es = new ExcelSetup("C:\\Users\\SU20370349\\eclipse-workspace\\PracticeProject\\src\\main\\java\\TestData\\TestData.xlsx");
		
		int rowCount = es.getRowCount("sampledata");
		int colCount = es.getColCount("sampledata");
		
		
		Object[][] data = new Object[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				data[i][j]=es.getExceldata("sampledata", i, j);
			}
		}
		
		return data;
	}
	
	
	
}
