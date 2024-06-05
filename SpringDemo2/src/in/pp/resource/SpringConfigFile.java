package in.pp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pp.beans.Student;
@Configuration
public class SpringConfigFile {

    @Bean("std1")
    public Student craeted() {
    	Student std = new Student();
    	std.setName("prabhat");
    	std.setRollno(19);
    	std.setEmail("prabhat@gmail.com");
    	
   
        return std;
    }
    @Bean("std2")
    public Student craeted2() {
    	Student std = new Student();
    	std.setName("mradul");
    	std.setRollno(34);
    	std.setEmail("mradul@gmail.com");
    	
   
        return std;
    }
}