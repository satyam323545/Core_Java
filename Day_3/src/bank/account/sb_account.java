package bank.account;

public class sb_account extends account_1 {

	
	
	public sb_account(int account_no, float account_bal, float intrest) {
		super(account_no, account_bal, intrest);
		this.account_bal=account_bal;
		this.account_no=account_no;
		this.intrest=intrest;
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float withdraw_amt){
		if(account_bal-withdraw_amt>=500){
			account_bal=account_bal-withdraw_amt;
			
		}
		
	}
	
	public void deposit(float deposit_amt){
		account_bal=account_bal+deposit_amt;
	}
	
}
