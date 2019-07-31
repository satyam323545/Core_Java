package remaining.programs;

public class seven_between_15_and_75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a=15,sum=0;
		
		while(a<75){
			if(a%7==0){
				sum=sum+a;
			}
			a++;
		}
		System.out.println(sum);
	}

}
