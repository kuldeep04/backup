package testNG_practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest extends Toolsqa_excel {

	ExcelReading excel = new ExcelReading();

	Toolsqa_excel toolsqa = new Toolsqa_excel();

	@Test
	@Parameters("myname")
	public void parameter(String myname) {
		System.out.println(myname);

	}

	@DataProvider(name = "Data1")
	@Test
	public Object[][] dataprovider() {
		return new Object[][] { { "Kuldeep", new Integer(36) }, { "Yadav", new Integer(37) } };
	}

	@DataProvider(name = "Testdata")
	@Test
	public Object[][] getexceldata() throws Exception {
		Object[][] testdata = getTableArray("D:\\seleniumproject\\testNG_practice\\testdata\\testdata.xlsx");
		return testdata;

	}

	@Test(dataProvider = "Testdata")
	public void testmethod(String n1, String i, String a, String b) {
		System.out.println(n1 + "" + i + "" + a + "" + b);

	}
	@Test(dataProvider="Data1")
	public void testdataprovider(String a, Integer b){
		System.out.println(a+""+b);
	}

}
