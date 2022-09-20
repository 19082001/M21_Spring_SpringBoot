package com.example.demo;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CollegeService 
{
	@Autowired  //to inject object dependencies
	
    private CollegeRepository repo;
    
    //Create Or Insert or Update 
    public void create(College c)
    {
    	repo.save(c);
    }
    
    //retrieve data
    public College retrieve(Integer id)
    {
		return repo.findById(id).get();
    	
    }
    
    //retrieve all the data
    public List<College>retrieveAll ()
    {
		return repo.findAll();
    	
    }
  
    //delete
    public void delete(Integer id)
    {
    	repo.deleteById(id);
    }
    
}
