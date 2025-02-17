package in.pp.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pp.beans.Student;
import in.pp.resource.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std1 = (Student)context.getBean("std1");
		std1.display();
		Student std2 = (Student)context.getBean("std2");
		std2 .display();
	}

}
