package com.cg.d2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		
		
		College clg=a.getBean("s2",College.class);
		clg.display();
		
		System.out.println("");
		
		System.out.println("Students under college Id:" +clg.getClgId());
		
		List<Student2> students =clg.getStudents();
		for (Student2 i : students) 
		{
				i.display();
		}
	}

}