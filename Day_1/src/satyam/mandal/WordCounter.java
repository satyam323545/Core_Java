package satyam.mandal;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a set a of wierd words in a sentence");
			String str=scan.nextLine();
			
			int firstindex=0,lastindex=0,count=0;
			
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==' ') {
					firstindex=lastindex;
					lastindex=i;
					System.out.println("\t"+str.substring(firstindex, lastindex));
					count++;
				}
				
				
			}
			
			System.out.println("\t"+str.substring(lastindex, str.length()));
			System.out.println(++count);
	}

}
