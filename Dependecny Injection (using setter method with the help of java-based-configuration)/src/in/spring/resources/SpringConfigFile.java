package in.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.beans.Address;
import in.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean 
	public Address creatObj() {
		Address addr= new Address();
		
		addr.setHouseNo(12);
		addr.setCity("chennai");
		addr.setPinCode(207123);
		return addr;
	}
	
	@Bean
	public Student createObj2() {
		Student std = new Student();
		std.setName("Abdul malik");
		std.setRollNo(1544);
		std.setAddress(creatObj());
		return std;
	}

}
