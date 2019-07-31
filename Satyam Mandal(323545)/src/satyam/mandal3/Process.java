package satyam.mandal3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Process extends Products{
	static File file=new File("ASSESSMENT.xlsx");
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		getData();
		
		
		
		
	}

	private static void setData1(int rate, int units, int i) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input=new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(0);
					XSSFRow row=sheet.getRow(i);
//						
					System.out.println(rate);
						XSSFCell cell=row.createCell(4);
						XSSFCell cell1=row.createCell(5);
						int price=rate*units;
						if(price<25000) {
							cell1.setCellValue("A");
						}
						else {
							cell1.setCellValue("B");
						}
						cell.setCellValue(price);
						FileOutputStream output=new FileOutputStream(file);
						workbook.write(output);

			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("resource")
	private static void getData() {
		// TODO Auto-generated method stub
		Products products=new Products();
		ArrayList<Products> al=new ArrayList<Products>();
		try {
			FileInputStream input=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(0);
			
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++) {
					XSSFCell cell=row.getCell(j);
					if(j==0) {
						products.ID=(int) cell.getNumericCellValue();
					}
					if(j==1) {
						products.name=cell.getStringCellValue();
					}
					if(j==2) {
						products.rate=(int) cell.getNumericCellValue();
					}
					if(j==3) {
						products.units=(int) cell.getNumericCellValue();
					}
				}
				al.add(products);
				setData1(products.rate,products.units,i);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
	}

	

}
