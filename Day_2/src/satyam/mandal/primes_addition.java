

//Name: Satyam Mandal.
//W.A.P to add a set of prime numbers.
==============================================================================
package satyam.mandal;

public class primes_addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		int i=0,sum=0;
		for(i=3;i<30;i++){
			sum=sum+check_prime(i);
		}
		System.out.println(sum);
		
	
	}

	private static int check_prime(int i) {
		for(int n=2;n<i;n++){
			if(i%n==0){
				return 0;
			}
		}
		return i;
	}
	
}
