package com.prabhat.learn.FirstSpring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.pp.beans.Student;
import in.pp.mappers.StudentRowMappers;
import in.pp.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbctemplate =context.getBean(JdbcTemplate.class);
        
        // ========  Insert Operation ===================//
        
//        int rollno = 102;
//    	String name = "prajwal";
//    	float marks = 77.77f;
        
//        String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//        int count =jdbctemplate.update(insert_sql_query,rollno,name,marks);
//        
//        if(count>0) {
//        	System.out.println("insertion successful");
//        }
//        else {
//        	System.out.println("insertion failed");
//        }
//        
        // ==============  Update operation ================//
        
//        float marks = 35.5f;
//        int rollno =101;
//        
//        String update_sql_query = "UPDATE student SET std_marks=? WHERE std_rollno = ?";
//        int count = jdbctemplate.update(update_sql_query,marks,rollno);
//      
//        if(count>0) {
//        	System.out.println("UPDATE successful");
//       }
//        else {
//        	System.out.println("UPDATE failed");
//        }
//        
        
        
        
        //================DELETE OPERATION====================///
        
//        int rollno = 102;
//        
//        String delete_sql_query ="DELETE FROM student WHERE std_rollno=?";
//         int count= jdbctemplate.update(delete_sql_query,rollno);
//         
//         if(count>0) {
//        	System.out.println("DELETE successful");
//      }
//        else {
//         	System.out.println("DELETE failed");         
//         	}
        
        
        // ================== SELECT OPERATION ========//
        String selectSqlQuery = "SELECT * FROM student";
        List<Student> stdList = jdbctemplate.query(selectSqlQuery, new StudentRowMappers());
        for (Student std : stdList) {
            System.out.println("Rollno :" + std.getRollno());
            System.out.println("Name :" + std.getName());
            System.out.println("Marks :" + std.getMarks());
            System.out.println("-------------------------");
        }
        
        
    }
}

