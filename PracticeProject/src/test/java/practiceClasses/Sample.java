package practiceClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelSetup;

public class Sample {

	@Test(dataProvider = "DataProvider")
	public void harddataprovider(String a,String b) {
		System.out.println(a+" "+b);
	}
	
	
	
	@DataProvider(name="DataProvider")
	public Object[][] dataprovider(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0]= "abc";
		data[0][1]= "efg";
		data[1][0]= "hij";
		data[1][1]= "klm";
		
		return data;
	}
	
}
