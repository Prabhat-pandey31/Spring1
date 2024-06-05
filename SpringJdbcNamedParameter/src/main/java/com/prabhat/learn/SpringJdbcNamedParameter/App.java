package com.prabhat.learn.SpringJdbcNamedParameter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.pp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
       
       NamedParameterJdbcTemplate np=(NamedParameterJdbcTemplate)context.getBean("npjdbctemp");
       
       
       Map<String, Object> map = new HashMap<String, Object>();
       map.put("key_rollno", 102);
       map.put("key_name", "pia");
       map.put("key_marks", 91.5f);
       String insert_sql_query = "INSERT INTO student VALUES(:key_rollno, :key_name, :key_marks)";
      int count = np.update(insert_sql_query, map);
      if(count>0) {
    	  System.out.println("updated successfully");
      }
      else {
    	  System.out.println("updated failed");
      }
    }
}
