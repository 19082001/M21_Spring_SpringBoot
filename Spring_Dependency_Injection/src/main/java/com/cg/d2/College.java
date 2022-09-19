package com.cg.d2;

import java.util.List;

public class College 
{
	private int ClgId;
	private String ClgName;
	
	
	//Dependency in form of collection
	private List<Student2> students;
	
	//setters method
	public void setClgId(int clgId) {
		ClgId = clgId;
	}
	public void setClgName(String clgName) {
		ClgName = clgName;
	}
	public void setStudents(List<Student2> students) {
		this.students = students;
	}
	
	
	//getters method
	public List<Student2> getStudents() {
		return students;
	}
	
	public int getClgId() {
		return ClgId;
	}
	public void display()
	{
		
		System.out.println("College Id is: "+ClgId);
		System.out.println("College Name is: "+ClgName);
	}
	

}