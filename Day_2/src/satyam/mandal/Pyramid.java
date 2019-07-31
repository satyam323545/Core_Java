package satyam.mandal;

public class Pyramid {

	/**
	 * @param args
	 */
	public static void space(int jump){
		int i=0;
		while(i<=jump){
			System.out.print(" ");
			i++;
		}
	}
	
	public static void line(int num,int times){
		for(int i=0;i<times;i++){
			System.out.print(num);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	
	
	public static void main(String[] args) {
		
		
		int jump=3;
		int num=9,times=1;
		for(int i=0;i<4;i++){
			space(jump);
			
			line(num,times);
			num=num-2;
			times=times+1;
			jump--;
			
		}
		
		
		jump=1;
		num=5;
		times=3;
		for(int i=0;i<3;i++){
			space(jump);
			line(num,times);
			num=num+2;
			times--;
			jump++;
		}

	}

}
