package satyam.mandal.abstractclass;

public abstract class Employee {
	int emp_id;
	String emp_name;
	int rateperunit;
	
	abstract public int calc_monthly_salary();
	
	Employee(int emp_id,String emp_name,int rateperunit){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.rateperunit=rateperunit;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getRateperunit() {
		return rateperunit;
	}

	public void setRateperunit(int rateperunit) {
		this.rateperunit = rateperunit;
	}
}
