package satyam.mandal;

public class FD_account extends Account{
		
	Account acc=new Account(0);
	
	
	FD_account(int balance,int intrest) {
		super(balance);
		this.intrest=acc.setIntrest(intrest);
		// TODO Auto-generated constructor stub
	}
	
	public float maturity(){
		balance=(int) (balance+amount);
		return balance;
	}
	
	
}
