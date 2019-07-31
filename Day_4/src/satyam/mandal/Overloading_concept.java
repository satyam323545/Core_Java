package satyam.mandal;

import java.util.Scanner;

public class Overloading_concept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt(),b=scan.nextInt();
		float k=scan.nextFloat(),l=scan.nextFloat(),m=scan.nextFloat();
		
		System.out.println("Integer " +add(a,b));
		System.out.println(add(k,l,m));
		
		
	

	}
	
	public static float add(float a,float b, float c){
		float k=a+b+c;
		return k;
	}
	
	public static int add(int x, int y){
		int z=x+y;
		return z;
	}

}
