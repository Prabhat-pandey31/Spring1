package in.pp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pp.beans.Student;
import in.pp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = (Student)context.getBean(Student.class);
		std.display();
	}

}
