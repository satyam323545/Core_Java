//Attributes required for the development of the program are:
//	1. balance/principal
//	2. intrest rate for specific accounts.
//	3. calculated intrest.
//	4. calculating intrest.(requires a common method).




package satyam.mandal;

public class Account {
	int balance;
	int intrest;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	Account(int balance){
		this.balance=balance;
	}

	public int getIntrest() {
		return intrest;
	}

	public int setIntrest(int intrest) {
		return this.intrest = intrest;
	}
	float amount=0;
	
	public float amt(){
		
		amount=(balance*intrest*1)/100;
		
		return amount;			
	}
	
	
}
