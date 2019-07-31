package satyam.mandal;

import java.util.Scanner;

public class Word_counter {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str;
		System.out.println("Enter String: ");
		str=scan.nextLine();
		int index=0,i=0,c=0;
		
		while(index != -1){
			index = str.indexOf(' ', i);
			i=index+1;
			if(index != -1)
				System.out.println(str.substring(c, index));
			else
				System.out.println(str.substring(c, str.length()));
			c = index+1;
		}
		
		
		
	}
	
}
