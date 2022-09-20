package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlacementService 
{
	
	@Autowired //To inject object dependency
	PlacementRepository pao;
	
	//Insert
	public void create(Placement p)
	{
		pao.save(p);
	}
	
	//Retrieve
	public Placement retrieve(Integer id)
	{
		return pao.findById(id).get();
	}
	
	//Retrieve All
	public List<Placement>retrieveAll()
	{
		return pao.findAll();
		
	}
	
	//Delete
	public void delete(Integer id)
	{
		pao.deleteById(id);
	}
	

}
