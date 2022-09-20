package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository is exists in Spring data JPA dependencies while creating the project spring we have added it


public interface CollegeRepository extends JpaRepository<College, Integer>
{
   
}
