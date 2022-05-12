package practiceClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelSetup;

public class DataProvider2 {

	
	@Test(dataProvider = "DataMaster")
	public void printexceldata(String a, String b) {
		System.out.println(a+" "+b);
	}
	
	
	@DataProvider(name="DataMaster")
	public Object[][] dataprovider(){
		ExcelSetup es = new ExcelSetup("C:\\Users\\SU20370349\\eclipse-workspace\\PracticeProject\\src\\main\\java\\TestData\\TestData.xlsx");
		
		int rowcount = es.getRowCount("sampledata");
		int colcount = es.getColCount("sampledata");
		
		Object[][] data = new Object[rowcount][colcount];
		
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				data[i][j] = es.getExceldata("sampledata", i, j);
			}
		}
		return data;
	}
	
}
