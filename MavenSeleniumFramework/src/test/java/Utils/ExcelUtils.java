package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getRowCount();
		getCellData();
	}

	public static void getRowCount() {
		try {

			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : " + rowCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();

		}
	}

	public static void getCellData() {
		try {

			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();

		}
	}

}
