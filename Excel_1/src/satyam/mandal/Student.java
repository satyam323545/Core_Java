package satyam.mandal;
public class Student {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		int id;
		String name;
		int marks1;
		int marks2;
		float average;
		
		
		public void average(){
			average=(marks1+marks2)/2;
		}

	
	
	public Student(int id,String name, int marks1,int marks2){
		this.id=id;
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
	}



	public Student() {
		// TODO Auto-generated constructor stub
	}

}
