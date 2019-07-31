package satyam.mandal;

import java.util.Scanner;

public class Program_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt(),i=0;
		int a=1,b=1,c=0;
		System.out.print(a+" ");i++;
		while(i<limit){
			System.out.print(b+" ");
			c=a;
			a=b;
			b=b+c;
			i++;
		}

	}

}
