package bank.account;

public class account_1 {
	
	int account_no;
	float account_bal;
	float intrest;
	
	public account_1(int account_no,float account_bal,float intrest){
		this.account_bal=account_bal;
		
	}
	
	public String get_account_details(){
		String str="Account number : "+account_no+"\n"
				+"Account Balance : "+account_bal+"\n"
				+"Intrest Rate : "+intrest+"\n"
				+"=================================";
		
		return str;
	}
	
	
	public void calculateIntrest(float amt){
		System.out.println("Intrest: "+amt * intrest/100);
	}

}
