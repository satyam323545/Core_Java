package satyam.mandal;

public class Program_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1,s=4;
		for(int i=1;i<6;i++){
			space(s);
			for(int j=0;j<i;j++){
				System.out.print(k+" ");
			}
			k++;
			s--;
			System.out.println("");
		}
		s=s+2;
		k=k-2;
		
		for(int i=5;i>0;i--){
			space(s);
			for(int j=1;j<i;j++){
				System.out.print(k+" ");
			}
			s++;
			k--;
			System.out.println("");
		}

	}

	private static void space(int s) {
		for(int j=0;j<s;j++){
			System.out.print(" ");
		}
		
	}

}
