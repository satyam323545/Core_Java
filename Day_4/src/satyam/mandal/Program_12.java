package satyam.mandal;


public class Program_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int[] arr=new int[12];
		System.out.println("Enter count for primes");
		System.out.print(2+" ");
		arr[count]=2;
		count++;
		
		
		
		for(int i=3;i<100;i++){
			if(prime(i)){
				if(count>9){
					continue;
				}
				System.out.print(i+" ");
				arr[count]=i;
				count++;
				
			}
		}
		System.out.println(""+arr[0]);
		
		for(int i=0;i<arr.length;i=i+4){
			System.out.print(arr[i]+" ");
			System.out.print(arr[i+1]+" ");
			System.out.print(arr[i+2]+arr[i+3]+" ");
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
