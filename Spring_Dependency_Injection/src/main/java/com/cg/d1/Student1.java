package com.cg.d1;

public class Student1 
{
	//dependency in the form of objects
	Cheat c;
	
	//setters method for dependency injection
	public void setC(Cheat c) {
		this.c = c;
	}

	public void cheating()
		{
			c.mathCheat();
		}
}