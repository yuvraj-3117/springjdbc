package com.springcorejdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcorejdbc.dao.StudentDao;
import com.springcorejdbc.entitites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// spring jdbc --> jdbc templete object
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcorejdbc/config.xml");
//first way to insrt data
	/*	JdbcTemplate templete = context.getBean("jdbcTemplete", JdbcTemplate.class);
		// insert query
		String query = "insert into student(id,name,city)values(?,?,?)";
		// fire query
		int result = templete.update(query,300,"yuvi","mumbai") ;
		System.out.println( "data inserted"+result);  */
		
		
		StudentDao studentdao = context.getBean("studentDao", StudentDao.class);
		//insert
	/*	Student student = new Student();
		student.setId(66767);
		student.setName("mohan");
		student.setCity("pune");
		
	
			 int result = studentdao.insert(student);
			 System.out.println(result);*/
		
		//update
	/*	Student student = new Student();
		student.setId(222);
		student.setCity("indore");
		student.setName("raju");
		
		int change = studentdao.change(student);
		System.out.println( "data update"+change);*/
		
		//delete 	
		int result= studentdao.delete(222);
		
		System.out.println("deleted" +result);
		
/*
 * Student student=studentdao.getStudent(300); System.out.println(student);
 */
		
		
		
	}
}
