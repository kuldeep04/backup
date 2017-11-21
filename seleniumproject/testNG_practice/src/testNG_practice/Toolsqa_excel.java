package testNG_practice;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Toolsqa_excel {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	@SuppressWarnings("unused")
	private static XSSFRow Row;

	public static Object[][] getTableArray(String FilePath) throws Exception {

		String[][] tabArray = null;

		try {

			FileInputStream ExcelFile = new FileInputStream(FilePath);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet("Sheet1");
			int ci, cj;
			int totalRows = ExcelWSheet.getLastRowNum() - ExcelWSheet.getFirstRowNum();
			org.apache.poi.ss.usermodel.Row row = ExcelWSheet.getRow(totalRows);
			int totalCols = row.getLastCellNum();
			tabArray = new String[totalRows][totalCols];
			ci = 0;
			for (int i = 0; i < totalRows; i++, ci++) {
				cj = 0;
				for (int j = 0; j < totalCols; j++, cj++) {
					tabArray[ci][cj] = getCellData(i, j);

					// System.out.println(tabArray[ci][cj]);

				}

			}

		}

		catch (FileNotFoundException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		catch (IOException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return (tabArray);

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;

		} catch (Exception e) {

			System.out.println(e.getMessage());

			throw (e);

		}

	}

}