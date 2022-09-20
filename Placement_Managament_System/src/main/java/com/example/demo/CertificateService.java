package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CertificateService 
{
	
	@Autowired //To inject object dependency
	CertificateRepository cao;
	
	//Insert
	public void create(Certificate c)
	{
		cao.save(c);
	}
	
	//Retrieve
	public Certificate retrieve(Integer id)
	{
		return cao.findById(id).get();
	}
	
	//Retrieve All
	public List<Certificate>retrieveAll()
	{
		return cao.findAll();
		
	}
	
	//Delete
	public void delete(Integer id)
	{
		cao.deleteById(id);
	}
	

}
