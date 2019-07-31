package remaining.programs;

public class sum_of_even_pos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={13,23,4,13,6,7,134,98,6,4,90,21};
		int sum=0,e_sum=0,o_sum=0;
		
		for(int i=1;i<arr.length;i=i+2){
			sum=sum+arr[i];
		}
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]%2==0){
				e_sum=e_sum+arr[i];
			}
			else{
				o_sum=o_sum+arr[i];
			}
		}
		System.out.println("sum of even pos: "+sum);
		System.out.println("sum of even val: "+e_sum);
		System.out.println("sum of odd val: "+o_sum);
	}

}
