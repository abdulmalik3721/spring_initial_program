package in.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.beans.Address;
import in.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean 
	public Address creatObj() {
		Address addr= new Address(12,"Bombay",207123);
		
		return addr;
	}
	
	@Bean
	public Student createObj2() {
		Student std = new Student("abdul",1544,creatObj());
		
		return std;
	}

}
