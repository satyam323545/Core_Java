package satyam.mandal2;

public class Birds {
	private boolean canFly;
	private boolean isHunter;
	private boolean isNocturnal;
	private boolean isColonial;
	
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isHunter() {
		return isHunter;
	}
	public void setHunter(boolean isHunter) {
		this.isHunter = isHunter;
	}
	public boolean isNocturnal() {
		return isNocturnal;
	}
	public void setNocturnal(boolean isNocturnal) {
		this.isNocturnal = isNocturnal;
	}
	public boolean isColonial() {
		return isColonial;
	}
	public void setColonial(boolean isColonial) {
		this.isColonial = isColonial;
	}
	public Birds(boolean canFly, boolean isHunter, boolean isNocturnal, boolean isColonial) {
		super();
		this.canFly = canFly;
		this.isHunter = isHunter;
		this.isNocturnal = isNocturnal;
		this.isColonial = isColonial;
	}
	void getdetails(){
		System.out.println("Can fly: "+isCanFly());
		System.out.println("Can Hunt: "+ isHunter());
		System.out.println("Is it nocturnal: "+ isNocturnal());
		System.out.println("Does it lives in colonies: "+ isColonial() );
		
		
		
		System.out.println("========================================");
		
	}
	
	
	
	
}
