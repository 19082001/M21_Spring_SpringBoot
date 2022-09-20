package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This repository exists in Spring Data JPA dependancies while creating the spring starter project 
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
