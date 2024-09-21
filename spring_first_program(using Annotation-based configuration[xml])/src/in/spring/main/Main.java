package in.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.spring.beans.Student;

public class Main {

	public static void main(String[] args) {

		String recourse_file_path = "/in/spring/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(recourse_file_path);

		Student std = (Student) context.getBean("student");
		std.display();

	}

}
