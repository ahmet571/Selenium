package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectPath;
	static 	XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main (String[] args)
	{
		getRowCount();
		getCellData();
	}
	public static void getRowCount() {

		String projectPath = System.getProperty("user.dir");

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/exel/data.xlsx");
			sheet = workbook.getSheet("data");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("rowCount="+ rowCount);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		// TODO Auto-generated method stub


	}
	public static void getCellData() {

		String projectPath = System.getProperty("user.dir");

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/exel/data.xlsx");
			sheet = workbook.getSheet("data");
			String cellData= sheet.getRow(0).getCell(0).getStringCellValue();
			Double cellData2= sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(cellData);
			System.out.println(cellData2);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		// TODO Auto-generated method stub


	}


}
