package remaining.programs;
import java.util.ArrayList;
import java.util.Collections;

public class arr_sorting {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*ArrayList al=new ArrayList();
			al.add(13);
			al.add(34);
			al.add(32);
			al.add(55);
			al.add(77);
			al.add(1);
			al.add(6);
			al.add(9);
			al.add(6);
			al.add(4);
		
		//public static void sort(arr);
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));*/
		
		//...............................................................................
		System.out.println(" ");
		System.out.println(" ");
		long start=System.nanoTime();
		int[] arr={13,2,54,6,32,56,49,3,7,9};
		int temp,i=1;
		while(i<arr.length){
			if(arr[i-1]>arr[i]){
				temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
				i=1;
				continue;
				}
				i++;
		}
		long end=System.nanoTime();
		long k=end-start;
		System.out.println(k);
	}
}
