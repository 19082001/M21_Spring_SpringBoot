package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService 
{
	@Autowired  //To inject object dependancy.
	private StudentRepository sao;
	
	
	//Create or insert or update
	public void create(Student s)
	{
		sao.save(s);
	}
	
	//retrieve
	public Student retrieve(Integer id)
	{
		return sao.findById(id).get();
	}
	
	//retrieve all the data
	public List<Student>retrieveAll()
	{
		return sao.findAll();
	}
	
	//delete
	public void delete(Integer id)
	{
		sao.deleteById(id);
	}

}
