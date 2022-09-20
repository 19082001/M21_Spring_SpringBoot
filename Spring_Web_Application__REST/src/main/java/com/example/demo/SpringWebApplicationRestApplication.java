package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringWebApplicationRestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringWebApplicationRestApplication.class, args);
		//String str="Welcome to Spring REST";
		//System.out.println(str);
		//Employee e=new Employee();//calling to default constructor
		
		//Using SPRING IOC
	/*	Employee e=context.getBean(Employee.class);
		e.print(); */
		
		HelloController h=context.getBean(HelloController.class);
		System.out.println(h.display());
	}

}