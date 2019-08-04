package satyam.mandal;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=3;i<30;i++) {
			if(check_prime(i)) {
				System.out.print(i+"\t");
			}
		}

	}

	private static boolean check_prime(int i) {
		// TODO Auto-generated method stub
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}

}
