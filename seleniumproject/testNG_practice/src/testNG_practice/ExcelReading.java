package testNG_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static ArrayList<String> AL = new ArrayList<String>();

	String filepath = "";

	public static Workbook workbook(String filepath) throws IOException {
		String[] arrpath = filepath.split("\\.");
		String extension = arrpath[1];
		FileInputStream FIS = new FileInputStream(filepath);
		Workbook workbook = null;
		if (extension.equalsIgnoreCase(".xlsx")) {
			workbook = new XSSFWorkbook(FIS);
		} else if (extension.equalsIgnoreCase(".xls")) {
			workbook = new HSSFWorkbook(FIS);
		}
		return workbook;
	}

	public static void Sheet() {

	}

	@SuppressWarnings("resource")
	public static void excelreading(String filepath) throws IOException {
		FileInputStream FIS = new FileInputStream(filepath);
		Workbook workbook = new XSSFWorkbook(FIS);
		XSSFSheet sheet = (XSSFSheet) workbook.getSheet("Sheet1");
		int rowno = sheet.getLastRowNum() - sheet.getFirstRowNum();
		// System.out.println(rowno);
		int row;
		for (row = 0; row < rowno; row++) {
			Row getrow = sheet.getRow(row);
			int cell = getrow.getLastCellNum();
			// System.out.println(cell);
			int j;
			for (j = 0; j < cell; j++) {
				// System.out.println(getrow.getCell(j).getStringCellValue());
				AL.add(getrow.getCell(j).getStringCellValue());
			}
		}
	}

	@SuppressWarnings("resource")
	public static void excelreadingobjectreturn(String filepath) throws IOException {
		@SuppressWarnings("unused")
		String exceldata = null;
		FileInputStream Fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowno = sheet.getLastRowNum() - sheet.getFirstRowNum();
		for (int i = 0; i < rowno - 1; i++) {
			Row getrow = sheet.getRow(i);
			int cell = getrow.getLastCellNum();
			int j;
			for (j = 0; j < cell; j++) {

			}
		}

	}

	public void readData(String filepath, String sheetname) throws IOException {
		this.filepath = filepath;
		FileInputStream FIS = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(FIS);
		XSSFSheet worksheet = workbook.getSheet(sheetname);
		Iterator<Row> itrator = worksheet.iterator();
		while (itrator.hasNext()) {
			Row nextrow = itrator.next();
			Iterator<Cell> cellno = nextrow.cellIterator();
			while (cellno.hasNext()) {
				Cell cell = cellno.next();
				if (cell.getCellTypeEnum() == CellType.STRING) {
					cell.getStringCellValue();
				} else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
					cell.getNumericCellValue();
				} else if (cell.getCellTypeEnum() == CellType.BOOLEAN) {
					cell.getBooleanCellValue();
				}
				System.out.println(" - ");
			}
			System.out.println();
		}
		workbook.close();
		FIS.close();
	}

}
