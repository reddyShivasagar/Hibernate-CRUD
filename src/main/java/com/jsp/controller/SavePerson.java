package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class SavePerson {

	public static void main(String[] args) {
		
		//inserting data
		Person p=new Person();//creating table person

		p.setId(5);
		p.setName("sushil");
		p.setEmail("vamsi@gmail.com");
		p.setPassword("vasmi122");
		p.setSal(300000);
		p.setAge(32);
	
		PersonService personService=new PersonService();//creating personservice object
		
		Person per=personService.savePerson(p);
		
		if(per!=null) {
			System.out.println(" Data saved");
		}
		else 
		{
			System.out.println("Plz check data");
		}
		
		
		
		
	}
	
}
