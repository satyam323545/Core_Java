package satyam.mandal;

public class Encaptulation2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encaptulation1 enc=new Encaptulation1();
		enc.setAcc_no(52255);
		enc.setAcc_bal(40000);

		System.out.print(	enc.getAcc_bal()+ ":amount for account number "+ enc.getAcc_no());

	}

}
