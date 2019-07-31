package satyam.mandal.editingxmlfiles;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class WritingXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			File file=new File("C:\\Users\\satyam.mandal\\Documents\\Test1.xlsx");
			FileInputStream fos=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fos);
			XSSFSheet sheet=workbook.getSheetAt(1);
			XSSFRow row=sheet.createRow(5);
			XSSFCell cell=row.createCell(0);
			cell.setCellValue("Test");
			FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
