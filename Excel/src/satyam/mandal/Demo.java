package satyam.mandal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo extends Student{

	public Demo(int id, String name, int java_marks, int selenium_marks) {
		super(id, name, java_marks, selenium_marks);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param args
	 */
	static Student student=new Student(0, null, 0, 0);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<4;i++){
			read_excel(i);
			//write_excel(student.java_marks,student.selenium_marks,i);
		}
		

	}
	
	
private static Student write_excel(int j, int s,int i) {
	
	try {
		FileInputStream input=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.createRow(i);
		XSSFCell cell=row.createCell(4);
		float avg=(j+s)/2;
		cell.setCellValue(avg);
		FileOutputStream output=new FileOutputStream(file);
		workbook.write(output);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	return student;
		// TODO Auto-generated method stub
		
	}


public static Student read_excel(int i) {
		
		try {
			FileInputStream input=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(0);
//			for(int j=1;j<=sheet.getLastRowNum();j++){
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<=row.getLastCellNum();j++){
					XSSFCell cell=row.getCell(j);
					
					if(j==1){
						student.name=cell.getStringCellValue();
					}
					if(j==2){
						student.java_marks=(int) cell.getNumericCellValue();
					}
					if(j==3){
						student.selenium_marks=(int) cell.getNumericCellValue();
					}
					if(j==0){
						student.id=(int) cell.getNumericCellValue();
						System.out.println(student.id);
					}
//					al.add(student);
				}
				
				
//			}
			return student;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
		// TODO Auto-generated method stub
		
	}


}
