package satyam.mandal.abstractclass;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consultant c=new Consultant(1112,9,"SAtyAM",7);
		FullTimeEmployee fte=new FullTimeEmployee(1200,30,"Shashank",10);
		
		System.out.println("id: "+c.emp_id+"\t Name: "+c.emp_name+"\t Salary:"+c.calc_monthly_salary());
		System.out.println("id: "+fte.emp_id+"\tName: "+fte.emp_name+"\t Salary:"+fte.calc_monthly_salary());
	}

}
