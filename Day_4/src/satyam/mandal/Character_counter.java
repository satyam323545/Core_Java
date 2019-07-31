package satyam.mandal;

public class Character_counter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am Learning Core java";
		int i=0,p=0,count=0;
		while(p>=0){
			p=str.indexOf('a',i);
			i=p+1;
			count++;
			System.out.println(p);
			
		}
		System.out.println("Count: "+--count);
	}

}
