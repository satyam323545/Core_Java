package satyam.mandal;

import java.util.ArrayList;

public class Test_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> al=new ArrayList<String>();
			al.add("Satyam");
			al.add("Shashank");
			
			
			System.out.println(al.get(0));
			
			for(String s: al){
				System.out.println(s);
			}
	}

}
