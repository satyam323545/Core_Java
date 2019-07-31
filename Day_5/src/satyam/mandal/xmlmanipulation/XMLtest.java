package satyam.mandal.xmlmanipulation;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class XMLtest {

	/**
	 * @param args
	 */
	static File f= new File("C:\\Users\\satyam.mandal\\Documents\\Test1.xlsx");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,row_prime=0,row_even=0,row_odd=0;
		
		
		
		try{
			FileInputStream inputstream=new FileInputStream(f);
			XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
			for(int i=0;i<=workbook.getSheetAt(0).getLastRowNum();i++){
				data=getXML(i);							/*Works FINE*/
				if(prime(data)){
					writeXML2(data,row_prime);			/*Works FINE*/
					row_prime++;
					continue;
				}
				if(data%2==0){
					writeXML3(data,row_even);			/*Works FINE*/
					row_even++;
					continue;
				}
				if(data%2!=0){
					writeXML4(data,row_odd);			/*Works FINE*/
					row_odd++;
					continue;
				}
			}
			System.out.println("It Works");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}
	private static void writeXML3(int data, int row_even) {
		// TODO Auto-generated method stub
		
		try{
			FileInputStream input=new FileInputStream(f);
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(2);
			XSSFRow row=sheet.createRow(row_even);
			XSSFCell cell=row.createCell(0);
			cell.setCellValue(data);
			FileOutputStream stream=new FileOutputStream(f);
			workbook.write(stream);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	private static void writeXML4(int data, int row_even) {
		// TODO Auto-generated method stub
		
		try{
			FileInputStream input=new FileInputStream(f);
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(3);
			XSSFRow row=sheet.createRow(row_even);
			XSSFCell cell=row.createCell(0);
			cell.setCellValue(data);
			FileOutputStream stream=new FileOutputStream(f);
			workbook.write(stream);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private static void writeXML2(int data,int rownum) {
		// TODO Auto-generated method stub
		
		try{
			FileInputStream inputstream=new FileInputStream(f);
			XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
			XSSFSheet sheet=workbook.getSheetAt(1);
			XSSFRow row=sheet.createRow(rownum);
			XSSFCell cell=row.createCell(0);
			cell.setCellValue(data);
			FileOutputStream stream=new FileOutputStream(f);
			workbook.write(stream);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private static boolean prime(int data) {
		// TODO Auto-generated method stub
		for(int i=3;i<data;i++){
			if(data%i==0){
				return false;
			}
		}
		return true;
	}

	private static int getXML(int i) {
		int ret=0;
		try{
			FileInputStream inputstream=new FileInputStream("C:\\Users\\satyam.mandal\\Documents\\Test1.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
			XSSFSheet sheet=workbook.getSheetAt(0);
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			int data=Integer.parseInt(cell.getRawValue());
			ret=data;
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return ret;
		
		// TODO Auto-generated method stub
		
	}

}
