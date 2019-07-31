package satyam.mandal.editingxmlfiles;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\satyam.mandal\\Documents\\Test1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		
		
		System.out.println("FirstName: "+sheet.getRow(0).getCell(0)+"\nLastName: "+sheet.getRow(0).getCell(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
