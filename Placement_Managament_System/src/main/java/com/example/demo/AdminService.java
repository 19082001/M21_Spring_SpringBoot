package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class AdminService 
{
	@Autowired
	private AdminRepository repo;
	
	//Insert
	public void create(Admin a) 
	{
		repo.save(a);
	}
	
	//to retrive all data
	public List<Admin>retrieveAll()
	{
		return repo.findAll();
	}
	//
	public Admin retrieve(Integer id) 
	{
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) 
	{
		repo.deleteById(id);
	}
	
}
