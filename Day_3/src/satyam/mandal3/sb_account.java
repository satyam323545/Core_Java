package satyam.mandal3;

public class sb_account extends account {

	public void withdraw(float withdraw_amt){
		if(account_bal-withdraw_amt>=500){
			account_bal=account_bal-withdraw_amt;
			
		}
		
	}
	
	public void deposit(float deposit_amt){
		account_bal=account_bal+deposit_amt;
	}
	
}
