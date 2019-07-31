package satyam.mandal;

public class Program_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,k=4;
		for(int i=0;i<5;i++){
			space(k);
			for(int j=0;j<i;j++){
				System.out.print(c);
			}
			k--;
			c++;
			System.out.println("");
		}
		

	}

	private static void space(int k) {
		for(int i=k;i>0;i--){
			System.out.print(" ");
		}
		
		
	}

}
