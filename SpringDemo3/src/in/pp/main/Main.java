package in.pp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.pp.beans.Student;

public class Main {
    public static void main(String[] args) {
        String config_loc = "in/pp/resources/applicationContext.xml"; // Ensure this matches the directory structure
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
        
        Student std = (Student) context.getBean("student"); // Ensure the bean ID matches
        std.display(); // Ensure the Student class has a display method
    }
}