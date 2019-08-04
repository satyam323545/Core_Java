package satyam.mandal;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp=4;
		
		
		for(int i=0;i<5;i++) {
			space(sp);
			number(i+1);
			sp--;
		}
		
		sp=1;
		for(int i=4;i>0;i--) {
			space(sp);
			number(i);
			sp++;
		}
		

	}
	
	static void number(int num) {
		// TODO Auto-generated method stub
		for(int i=0;i<num;i++) {
			System.out.print(num+" ");
		}
		System.out.println(" ");
	}

	static void space(int sp) {
		for(int i=0;i<sp;i++) {
			System.out.print(" ");
		}
		
	}

}
