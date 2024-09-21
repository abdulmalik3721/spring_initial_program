package in.spring.beans;

public class Student {
	private String name;
	private String email;
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void display() {
		System.out.println("name: " + name);
		System.out.println("email: " + email);
		System.out.println("rollNo: " + rollNo);
	}
}
