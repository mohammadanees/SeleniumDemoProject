package FirstPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {
	
	public String filepath;
	Workbook workbook=null;
	FileInputStream fis=null;
	//Sheet sheet=null;;
	//Row row=null;;
	//Cell cell=null;;
	
	public ExcelData() throws IOException {
		
		String filepath = System.getProperty("user.dir")+"\\Excel\\EData.xlsx";
		String fileExtension = filepath.substring(filepath.indexOf(".x"));
		FileInputStream fis = new FileInputStream(filepath);
		if(fileExtension.equals(".xlsx")) {
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
		}else if(fileExtension.equals(".xls")) {
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
		}
		Sheet sheet=workbook.getSheetAt(0);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		ExcelData EData = new ExcelData();
		Sheet sheet = EData.workbook.getSheet("LoginData");
		int lastRowCnt=sheet.getLastRowNum();
		System.out.println("lastRowCnt : " + lastRowCnt);
	}

}
