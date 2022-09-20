package com.cg.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	private Heart h;
	
	//Default constructor
	public Human() {
		
		this.h = h;
	}
	
	
	//DI using constructor
	public Human(Heart h) {
		super();
		this.h = h;
	}

	
	//DI using setters
	@Autowired
	@Qualifier("o")
	public void setH(Heart h) {
		this.h = h;
	}
	


	public void display() 
	{
		h.pump();
		System.out.println("The name of Animal is "+h.getNameOfAnimal()+" and no of heart is "+h.getNoOfHeart());
	}

}