package satyam.mandal2;

public class Bird_data extends Birds{

	public Bird_data(boolean canFly, boolean isHunter, boolean isNocturnal, boolean isColonial, String food) {
		super(canFly, isHunter, isNocturnal, isColonial);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot parrot_species1=new Parrot(true, false, false, true);
		Parrot parrot_species2=new Parrot(true, false, false, true);
		Parrot parrot_species3=new Parrot(true, false, false, true);
		
		Birds owl1=new Owl(true, false, false, true);
		Birds owl2=new Owl(true, false, false, true);
		
		System.out.println("For different species of parrots");
		parrot_species1.getdetails();
		parrot_species2.getdetails();
		parrot_species3.getdetails();
		
		System.out.println("For different species of owl");
		owl1.getdetails();
		owl2.getdetails();
		
		

	}

}
