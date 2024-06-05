package in.pp.resources;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pp.beans.Address;
import in.pp.beans.Student;
import in.pp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address craeteaddobj() {
		
		Address addr = new Address();
		addr.setHouseno(600);
		addr.setCity("mathura");
		addr.setZipcode(123456);
		return addr;
		
	}
	
	@Bean
	public Student createstdobj() {
		
		Student str = new Student();
		str.setRollno(12);
		str.setName("prabhat");
		//str.setAddress(craeteaddobj());
		return str;
	}
	
	@Bean
	public Subjects craetesubobj() {
		Subjects sub = new Subjects();
		List<String> lst = new ArrayList<String>();
		lst.add("java");
		lst.add("c++");
		lst.add("python");
		
		sub.setSubjects(lst);
		return sub;
		
	}
	



}
