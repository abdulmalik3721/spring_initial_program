package in.spring.maven.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.maven.beans.Student;

public class App {
	public static void main(String[] args) {
		
		String config_location="/in/spring/mave/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_location);
		 
	Student std=(Student)context.getBean(Student.class);
	std.display();
		
	}
}
