package satyam.mandal;

import java.beans.Statement;
import java.util.ArrayList;

public class Student_1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> semester=new ArrayList<Student>();
		
		Student ramesh= new Student(112,"Ramesh",67,45);
		Student rakesh= new Student(334,"Rakesh",78,25);
		Student flash= new Student(119,"Flash",66,98);
		Student jhon=new Student(117,"Jhon",89,90);
		
		display(ramesh);
		
		semester.add(ramesh);
		semester.add(rakesh);
		semester.add(flash);
		semester.add(jhon);
		display(semester);
	}
	
	
	
	public static void display(Student s){
		System.out.println("======================");
		
		System.out.println("ID :"+s.id+"\n"+
				"Name :"+s.name+"\n"+
				"Marks1 :"+s.marks1+"\n"+
				"Marks2 :"+s.marks2+"\n");
	}
	
	public static void display(ArrayList<Student> s){
		{
			for(Student std: s){
				System.out.println("------------------------");
				std.average();
				System.out.println("ID :"+std.id+"\n"+
				"Name :"+std.name+"\n"+
				"Marks1 :"+std.marks1+"\n"+
				"Marks2 :"+std.marks2+"\n"+
				"Average :"+std.average+"\n");
			}
		}
	}

}

public class Student{
	int ID;
	String name;
	int marks1;
	int marks2;

}
