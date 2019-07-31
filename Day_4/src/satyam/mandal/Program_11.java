package satyam.mandal;


//Program for prime numbers.

public class Program_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter count for primes");
		int f=0,count=0;
		
		for(int i=3;i<100;i++){
			if(prime(i)){
				if(count==5){
					System.exit(0);
				}
				if(f<5){
					f++;
					continue;
				}
				System.out.print(i+" ");
				count++;
			}
		}

	}

	private static boolean prime(int i) {
		for(int j=2;j<i;j++){
			if(i%j==0){
				return false;
			}
		}
		return true;
	}

}
