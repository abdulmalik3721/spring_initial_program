package in.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Uruza")
	private String name;
	
	@Value("123")
	private int rollNo;
	
	@Value("23.45f")
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
		System.out.println("name: " + name);
		System.out.println("rollNo: " + rollNo);
		System.out.println("Marks: " +  marks);
		
	}
}
