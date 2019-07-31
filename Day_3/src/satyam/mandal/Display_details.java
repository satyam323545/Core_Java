package satyam.mandal;

public class Display_details {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobile1=new Mobile();
		
		mobile1.brand="Realme";
		mobile1.color="Black";
		
		System.out.println("Color: "+ mobile1.color+"\n");
		System.out.println("Brand: "+ mobile1.brand);
		System.out.println("============================");
		
		mobile1.call();
		mobile1.msg();
		mobile1.display_details();

	}

}
