package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) 
	{
		/*Student s = new Student();
		s.setStudentName("Snehal J");
		s.display();*/
		
		@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("The file is executing.....");
		Student s1 = c.getBean("s1",Student.class);
		//Student s2 = c.getBean("s2",Student.class);
		s1.display();
		//s2.display();
	}

}