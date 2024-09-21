package in.spring.main;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.spring.beans.Student;
import in.spring.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = (Student) context.getBean("std1");
		std.display();
		
		System.out.println("-------------");
		System.out.println();
		
//		Student std1 = (Student) context.getBean(Student.class);
//		std1.display();
		
		Student std2 = (Student ) context.getBean("stdObj1");
		std2.display();
		
		System.out.println("------------");
		
		Student std3 = (Student) context.getBean("stdObj2");
		std3.display();

	}

}
