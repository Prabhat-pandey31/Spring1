package in.pp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.pp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String configloc = "in/pp/resource/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configloc);
		
		Student std=(Student)context.getBean("stdid");
		
		std.display();
	}

}
