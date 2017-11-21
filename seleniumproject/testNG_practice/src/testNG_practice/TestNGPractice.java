package testNG_practice;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestNGPractice extends ExcelReading{
	
	@Test
	public static void print() throws IOException{
		System.out.println("TestNG print");
		excelreadingobjectreturn("D:\\seleniumproject\\testNG_practice\\testdata\\testdata.xlsx");
		
	}
}
