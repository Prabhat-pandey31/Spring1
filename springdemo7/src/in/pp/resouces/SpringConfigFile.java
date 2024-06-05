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
		Address addr = new Address();
		addr.setHouseno(600);
		addr.setCity("mathura");
		addr.setZipcode(123456);
		return addr;
		
	}
	
	@Bean
	public Student createstdrobj()
	{
		Student str = new Student();
		str.setRollno(12);
		str.setName("prabhat");
		str.setAddress(createAddrobj());
		return str;
	
	}


}
