package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class College
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
   private String collegename;
   private String location;
   
   //blank constructor
   public College()
   {
	   
   }
   
//constructor
   
 public College(Integer id, String collegename, String location) {
	super();
	this.id = id;
	this.collegename = collegename;
	this.location = location;
}
 
//setters and getters method
   
   public Integer getId()
   {
	      return id;
   }
   
   
    public void setId(Integer id) 
    {
	      this.id = id;
    }
    
    public String getCollegename()
    {
	       return collegename;
	}
    
    public void setCollegename(String collegename) 
    {
	       this.collegename = collegename;
    }
    
    public String getLocation()
    {
	       return location;
    }
    
    public void setLocation(String location) 
    {
	this.location = location;
    }

//ToString Method
@Override
    public String toString()
    {
	return "College [id=" + id + ", collegename=" + collegename + ", location=" + location + "]";
    }


}

