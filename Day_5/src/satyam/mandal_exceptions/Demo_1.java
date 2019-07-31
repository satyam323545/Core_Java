package satyam.mandal_exceptions;

public class Demo_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int a=10,b=0,c;
		
		int arr[]={12,34,76,43,98};
		
		try{
			//c=a/b;
			System.out.println(arr[7]);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmatic Exception");
		}
			
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndex OutOfBoundsException ");
		}

	}

}
