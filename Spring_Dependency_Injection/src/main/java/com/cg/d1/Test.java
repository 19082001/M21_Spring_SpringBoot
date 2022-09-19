package com.cg.d1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		Student1 s1=a.getBean("s1",Student1.class);
		s1.cheating();
	}

}