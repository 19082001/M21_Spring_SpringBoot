package com.cg.d2;

public class Student2 {
	private int StdId;
	private String StdName;
	
	
	
	//setters method
	public void setStdId(int stdId) {
		this.StdId = stdId;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	
	public void display()
	{
		System.out.println("Student Id is: "+StdId);
		System.out.println("Student Name is: "+StdName);
		
	}
	
	

}