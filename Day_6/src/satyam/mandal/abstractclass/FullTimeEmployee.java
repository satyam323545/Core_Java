package satyam.mandal.abstractclass;

public class FullTimeEmployee extends Employee {
	int totaldays;
	FullTimeEmployee(int emp_id,int totaldays,String emp_name, int rateperunit) {
		super(emp_id, emp_name, rateperunit);
		// TODO Auto-generated constructor stub
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.rateperunit=rateperunit;
		this.totaldays=totaldays;
	}
	public int calc_monthly_salary(){
		
		int sal=totaldays*rateperunit;
		return sal;
		
	}
}
