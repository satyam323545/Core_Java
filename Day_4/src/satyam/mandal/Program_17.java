package satyam.mandal;

import java.util.Scanner;

public class Program_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int k=num,temp=0;
		while(k>0){
			temp=(temp*10)+k%10;
			k=k/10;
		}
		System.out.println(temp);
		
		k=temp;
		int bin=0;
		while(k>0){
			bin=k%10;
			str(bin);
			k=k/10;
		}
	}

	private static void str(int k) {
		// TODO Auto-generated method stub
		switch(k){
		case 0:System.out.print("Zero ");
		break;
		
		case 1:System.out.print("One ");
		break;
		
		case 2:System.out.print("Two ");
		break;
		
		case 3:System.out.print("Three ");
		break;
		
		case 4:System.out.print("Four ");
		break;
		
		case 5:System.out.print("Five ");
		break;
		
		case 6:System.out.print("Six ");
		break;
		
		case 7:System.out.print("Seven ");
		break;
		
		case 8:System.out.print("Eight ");
		break;
		
		case 9:System.out.print("Nine ");
		break;
		}
		
	}

}
