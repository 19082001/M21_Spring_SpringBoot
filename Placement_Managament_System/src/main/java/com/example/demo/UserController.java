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
public class UserController 
{
	@Autowired
	private UserService service;
	
	//RESTFul API method to create operation
	@PostMapping(path="/user")
	public void add(@RequestBody User u)
	{
		service.create(u);
	}
	
	//RESTFul API method to delete operation
	@DeleteMapping("/user/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//RESTFul API method to update operation
	@PutMapping("/user/{id}")
	public ResponseEntity<?> update(@RequestBody User u,@PathVariable Integer id)
	{
		try
		{
			@SuppressWarnings("unused")
			User existObject=service.retrieve(id);
			service.create(u);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//RESTFul API method for retrieve operation
	@GetMapping(path="/user/{id}")
	public ResponseEntity<User> get(@PathVariable Integer id)
	{
		try
		{
			User u=service.retrieve(id);
			return new ResponseEntity<User>(u,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	//RESTFul API method for retrieveAll operation
	@GetMapping("/user")
	public List<User>retrieveAll()
	{
		return service.retrieveAll();
	}
}