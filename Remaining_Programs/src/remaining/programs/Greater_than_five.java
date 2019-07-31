package remaining.programs;

import java.util.Scanner;


public class Greater_than_five {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		
		while(num>0){
			if((num%10)>5){
				sum=sum+num%10;
			}
			num=num/10;
		}
		
		System.out.println(sum);
		
	}

}
