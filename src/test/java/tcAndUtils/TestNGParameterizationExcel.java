package tcAndUtils;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {

	public static ExcelReader excel = null;

//	@Test(dataProvider="getData")
//	public void testData(String username, String password, String is_correct) {
//		
//		System.out.println(username+"-------"+password+"--------"+is_correct);
//		
//	}

	@Test(dataProvider = "getData")
	public void testData(Hashtable<String, String> data) {

		System.out.println(data.get("username")+"---"+data.get("password")+"---"+data.get("is_correct"));

	}

	@DataProvider
	public static Object[][] getData() {

		if (excel == null) {

			excel = new ExcelReader("src/test/resources/Excel/testngdata.xlsx");
		}

		String sheetName = "loginTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		// Object[][] data = new Object[rows-1][cols];

		Object[][] data = new Object[rows - 1][1];
		
		Hashtable<String, String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			
			table = new Hashtable<String, String>();

			for (int colNum = 0; colNum < cols; colNum++) {

				//data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
				
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum-2][0]=table; 
				
			}

		}

		return data;

	}

}
