package satyam.mandal;

public class test_account {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start=System.nanoTime();
		Account Ram=new SB_account(25000, 4);
		//SB_account Ram=new SB_account(25000, 4);
		SB_account Shyam=new SB_account(35000 , 4);
		SB_account Prashant=new SB_account(20000 , 4); 
		
		
		FD_account Ram_fd=new FD_account(25000, 6);
		FD_account Shyam_fd=new FD_account(35000, 6);
		FD_account Prashant_fd=new FD_account(20000, 6);
		System.out.println("FOR SB account...................");
		System.out.println("Total intrest:"+ Ram.amt()+"\t"+ "Base Amount: "+Ram.getBalance());
		System.out.println("Total intrest:"+ Shyam.amt()+"\t"+ "Base Amount: "+Shyam.getBalance());
		System.out.println("Total intrest:"+ Prashant.amt()+"\t"+ "Base Amount: "+Prashant.getBalance());
		
		System.out.println("FOR FD account..................,\n");
		
		System.out.println("Total intrest:"+ Ram_fd.amt()+"\t"+ "Maturity Amount: "+Ram_fd.maturity());
		System.out.println("Total intrest:"+ Shyam_fd.amt()+"\t"+ "Maturity Amount: "+Shyam_fd.maturity());
		System.out.println("Total intrest:"+ Prashant_fd.amt()+"\t"+ "Maturity Amount: "+Prashant_fd.maturity());
		
		long end=System.nanoTime();
		
		System.out.println("\n\nTime to execute the program: "+ (end-start));
		
	}

}
