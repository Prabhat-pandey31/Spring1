package in.pp.resouces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pp.beans.Address;
import in.pp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddrobj()
	{
		Address addr = new Address(111,"mathura",12345);
		return addr;
		
		
	}
	
	@Bean
	public Student createstdrobj(){
	
		Student str = new Student(10,"prabhat",createAddrobj());
		return str;
		
	}
}
