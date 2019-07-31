package satyam.mandal;

public class test_bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new icici();
		System.out.println(b1.get_roi());
		
		Bank b2=new citi();
		System.out.println(b2.get_roi());
	}

}
