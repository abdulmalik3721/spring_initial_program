package is.spring.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String config_file_location = "/in/spring/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_location);
		
		Student std1 = (Student) context.getBean("stdId");
		std1.display();

	}

}
