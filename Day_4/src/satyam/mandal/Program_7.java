package satyam.mandal;

public class Program_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,k=5;
		for(int i=6;i>0;i--){
			space(s);
			for(int j=1;j<i;j++){
				
				System.out.print(k);
			}
			s++;
			k--;
			System.out.println("");
		}

	}

	private static void space(int s) {
		for(int i=0;i<s;i++){
			System.out.print(" ");
		}
		
	}

}
