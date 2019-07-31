package satyam.mandal;
import java.util.*;

public class Pro_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int temp=num;
		int k;
		while(temp>0){
			k=temp%10;
			data(k);
			temp=temp/10;
		}

	}
	
	public static void data(int n){
		switch(n){
		case 0:System.out.println("Zero");
		break;
		
		case 1:System.out.println("One");
		break;
		
		case 2:System.out.println("Two");
		break;
		
		case 3:System.out.println("Three");
		break;
		
		case 4:System.out.println("Four");
		break;
		
		case 5:System.out.println("Five");
		break;
		
		case 6:System.out.println("Six");
		break;
		
		case 7:System.out.println("Seven");
		break;
		
		case 8:System.out.println("Eight");
		break;
		
		case 9:System.out.println("Nine");
		break;
		}
	}

}
