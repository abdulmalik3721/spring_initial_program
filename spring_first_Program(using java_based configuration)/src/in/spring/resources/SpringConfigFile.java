package in.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student std1() {
		Student std = new Student();
		std.setName("ABDUL");
		std.setEmail("malik.kasganj@gmail.com");
		std.setRollNo(1544);
		return std;
}
	
	@Bean("stdObj1")
	public Student crateBeanObj1() {
		Student std = new Student();
		std.setName("ABDUL");
		std.setEmail("malik.kasganj@gmail.com");
		std.setRollNo(1544);
		return std;
	}
	
	@Bean("stdObj2")
	public Student crateBeanObj2() {
		Student std = new Student();
		std.setName("Uruza");
		std.setEmail("uruza.kasganj@gmail.com");
		std.setRollNo(1222);
		return std;
	}
}
