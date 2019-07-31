package satyam.mandal;
import java.util.*;

public class Mobile {

	/**
	 * @param args
	 */
	Scanner scan=new Scanner(System.in);
	
	String color;
	float length;
	float breadth;
	String brand;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public void call(){
		System.out.println("Mobile is calling.");
		String call=scan.next();
		if(call.equalsIgnoreCase("accept")){
			System.out.println("CALL ACCEPTED");
		}
		if(call.equalsIgnoreCase("reject")){
			System.out.println("CALL ACCEPTED");
		}
	}
	
	public void msg(){
		System.out.println("Mobile is texting.");
	}
	
	public void display_details(){
		System.out.println("Color: "+color+"\nBrand: "+brand);
	}

}
