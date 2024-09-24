package in.spring.maven.beans;

public class Student {
	private String name;
	private int rollNo;
	private float marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("RollNo: " + rollNo);
		System.out.println("Marks: " + marks);
	}
}
