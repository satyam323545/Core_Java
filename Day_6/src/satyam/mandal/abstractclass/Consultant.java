package satyam.mandal.abstractclass;

public class Consultant extends Employee {

	Consultant(int emp_id,int totalhoursworked, String emp_name, int rateperunit) {
		super(emp_id, emp_name, rateperunit);
		// TODO Auto-generated constructor stub
		this.emp_id=emp_id;
		this.totalhoursworked=totalhoursworked;
		this.emp_name=emp_name;
		this.rateperunit=rateperunit;
	}



	/**
	 * @param args
	 */
	int totalhoursworked;
	public int calc_monthly_salary(){
		int sal=totalhoursworked*rateperunit;
		return sal;
	}
	
	
}
