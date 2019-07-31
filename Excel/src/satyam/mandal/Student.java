package satyam.mandal;

public class Student {
	int id;
	String name;
	int java_marks;
	int selenium_marks;
	public int getJava_marks() {
		return java_marks;
	}
	public void setJava_marks(int java_marks) {
		this.java_marks = java_marks;
	}
	public int getSelenium_marks() {
		return selenium_marks;
	}
	public void setSelenium_marks(int selenium_marks) {
		this.selenium_marks = selenium_marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name, int java_marks, int selenium_marks) {
		super();
		this.id = id;
		this.name = name;
		this.java_marks = java_marks;
		this.selenium_marks = selenium_marks;
	}
	
}
