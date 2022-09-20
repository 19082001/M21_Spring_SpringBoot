package com.example.demo;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService 
{
	@Autowired  //To inject object dependency
	private UserRepository uao;
	
	//create
	public void create(User u) 
	{
		uao.save(u);
	}
	
	//to retrieve a specific row
	public User retrieve(Integer id) 
	{	
		return uao.findById(id).get();
	}
	
	//to retrieve all data
	public List<User> retrieveAll() 
	{		
		return uao.findAll();
	}
	
	// delete
	public void delete(Integer id) 
	{
		uao.deleteById(id);
		
	}

}