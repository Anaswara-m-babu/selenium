package excelutilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Utilexcelsheet {
public static String getCellValue(String xcel,String Sheet,int r,int c) {
	try {
		FileInputStream s1=new FileInputStream(xcel);
		XSSFWorkbook wb= new XSSFWorkbook(s1);
		XSSFCell cell=wb.getSheet(Sheet).getRow(r).getCell(c);
		if(cell.getCellType()==CellType.STRING) {
			return cell.getStringCellValue();
		}
		else {
			return cell.getRawValue();
		}
	}
	catch(Exception e) {
		return"";
	}
}
public static int getRowCount(String xcel,String Sheet) {
	try {
		FileInputStream s1=new FileInputStream(xcel);
		XSSFWorkbook wb=new XSSFWorkbook(s1);
		return wb.getSheet(Sheet).getLastRowNum();
	}
	catch(Exception e) {
		return 0;
	}
}

}

