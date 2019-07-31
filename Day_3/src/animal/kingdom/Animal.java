package animal.kingdom;

public class Animal {
	int age;
	String gender;
	String carni_herbi;
	int height;
	int weight;
	
	
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	private String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	private String getCarni_herbi() {
		return carni_herbi;
	}
	private void setCarni_herbi(String carni_herbi) {
		this.carni_herbi = carni_herbi;
	}
	
	public void migrate(){
		System.out.println("Migration Status");
	}
	
	public void hunt(){
		System.out.println("Hunting status");
	}
	
	
	
}
