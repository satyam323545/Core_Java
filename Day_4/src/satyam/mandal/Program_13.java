package satyam.mandal;

import java.util.Scanner;

public class Program_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		int sum=1;
		System.out.print(num +" = ");
		for(int i=num;i>1;i--){
			System.out.print(i+" *");
			sum=sum*i;
		}
		System.out.print(1+" = "+sum);
		
	}

}
