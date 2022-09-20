package com.cg.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		
		Human h=a.getBean("human",Human.class);
		h.display();

	}

}