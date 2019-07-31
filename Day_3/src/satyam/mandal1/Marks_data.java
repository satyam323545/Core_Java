package satyam.mandal1;
import java.util.*;

public class Marks_data {
	
	public static void main(String args[]){
		Student student1=new Student();
		Student student2=new Student();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name of student1 :");
		student1.setName(scan.next());
		System.out.println("Enter marks of student1 :");
		student1.setSub1(scan.nextInt());
		student1.setSub2(scan.nextInt());
		
		System.out.println("Enter name of student2 :");
		student2.setName(scan.next());
		System.out.println("Enter marks of student2 :");
		student2.setSub1(scan.nextInt());
		student2.setSub2(scan.nextInt());
		
		student1.setAvg(average(student1.sub1,student1.sub2));
		student2.setAvg(average(student2.sub1,student2.sub2));
		
		
		if(student1.getAvg()>student2.getAvg()){
			System.out.println(student1.name+ " has scored highest average of "+student1.avg);
		}
		else{
			System.out.println(student2.name+ " has scored highest average of "+student2.avg);
		}
	}
	
	public static int average(int a, int b){
		int avg=(a+b)/2;
		return avg;
	}
	
	
	
	
}
