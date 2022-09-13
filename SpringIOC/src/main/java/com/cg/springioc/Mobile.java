package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		//*Agenda-Spring IOC
		//1.We should not touch the source code.
		//2.This Application should be configurable.
		//hard-coding*/
		//for Vi class methods
	/*	Vi v = new Vi();
		v.calling();
		v.data();	
		//for Jio class methods 
		Jio j=new Jio();
		j.calling();
		j.data();*/
		
	//	@SuppressWarnings("resource")
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded....");
		
	//for Vi class
		/*Vi v = (Vi)a.getBean("Vi");
		v.calling();
		v.data();
		
	//for Jio class
		Jio j = (Jio)a.getBean("Jio");
		j.calling();
		j.data();*/
		
		Sim s=a.getBean("Sim",Sim.class);
		s.calling();
		s.data();
		
		

	}

}
