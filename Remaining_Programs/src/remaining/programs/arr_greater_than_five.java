package remaining.programs;

import java.util.ArrayList;

public class arr_greater_than_five {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr={10,2,34,5,21,5,9,45};
			ArrayList al=new ArrayList(10);
			
			int sum=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>5){
					sum=sum+arr[i];
				}
			}
			System.out.println(sum);
	}

}
