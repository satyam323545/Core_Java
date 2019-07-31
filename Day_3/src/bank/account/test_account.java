package bank.account;

public class test_account {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		sb_account acc=new sb_account(90000,878787,9);
		acc.account_no=23456;
		acc.account_bal=90000;
		acc.intrest=12;
		
		acc.get_account_details();
		
		acc.deposit(1000);
		System.out.println("After a deposit........");
		System.out.println(acc.get_account_details());
		acc.calculateIntrest(acc.account_bal);
		System.out.println("After a withdrawl.........");
		acc.withdraw(6000);
		acc.calculateIntrest(acc.account_bal);
		
		System.out.println(acc.get_account_details());

	}

}
