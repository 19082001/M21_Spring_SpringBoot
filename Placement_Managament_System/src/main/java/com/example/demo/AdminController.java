package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController 
{
	@Autowired
	private AdminService service;
	
	//RESTFul API method to create operation
	@PostMapping(path="/admin")
	public void add(@RequestBody Admin a)
	{
		service.create(a);
	}
	
	//RESTFul API method to delete operation
	@DeleteMapping("/admin/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//RESTFul API method to update operation
	@PutMapping("/admin/{id}")
	public ResponseEntity<?> update(@RequestBody Admin a,@PathVariable Integer id)
	{
		try
		{
			@SuppressWarnings("unused")
			Admin existObject=service.retrieve(id);
			service.create(a);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//RESTFul API method for retrieve operation
	@GetMapping(path="/admin/{id}")
	public ResponseEntity<Admin> get(@PathVariable Integer id)
	{
		try
		{
			Admin a=service.retrieve(id);
			return new ResponseEntity<Admin>(a,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	
	//RESTFul API method for retrieveAll operation
	@GetMapping("/admin")
	public List<Admin>retrieveAll()
	{
		return service.retrieveAll();
	}
}
	
	
	
	
