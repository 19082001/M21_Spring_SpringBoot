package com.cg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Response;

@RestController
public class AnimalController 
{
	@GetMapping(path="/animal" , produces="application/txt")
	public ResponseEntity<Response>getAnimalDetails()
	{
	
	Response r= new Response();
	r.setData("Lion");
	r.setResponseCode(15);
	r.setStatus("Success");
	return new ResponseEntity<>(r,HttpStatus.OK);
	}

}