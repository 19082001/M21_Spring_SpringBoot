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
public class CollegeController
{
   @Autowired
   private CollegeService service;
   
   //RESTFUL API method to create operation 
   @PostMapping(path="/college")
   public void add(@RequestBody College c)
   {
	   service.create(c);
   }
   
   //RESTFUL API method to delete operation 
   @DeleteMapping("/college/{id}")
   public void remove(@PathVariable Integer id)
   {
	   service.delete(id);
   }
   
   //RESTFUL API method to update operation
   @PutMapping("/college/{id}")
   public ResponseEntity<?> update(@RequestBody College c,@PathVariable Integer id)
   {
	   try
	   {
	      College existObject=service.retrieve(id);
	      service.create(c);
	      return new ResponseEntity<>(HttpStatus.OK);
	   }
	   catch(NoSuchElementException e)
	   {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
	  
   }
   
   //RESTFUL API method to retrieve operation
   @GetMapping(path="/college/{id}")
   public ResponseEntity<College>get(@PathVariable Integer id)
   {
	   try
	   {
	      College c=service.retrieve(id);
	      return new ResponseEntity<College>(c,HttpStatus.OK);
	   }
	   catch(NoSuchElementException e)
	   {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
   }
   
   //RESTFUL API method to retrieveAll operation
   @GetMapping("/college")
   public List<College>listAll()
   {
	return service.retrieveAll();
	   
   }
   
}
