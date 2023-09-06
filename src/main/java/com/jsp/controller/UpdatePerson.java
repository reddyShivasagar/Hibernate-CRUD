package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class UpdatePerson {

	public static void main(String[] args) {
		 
		Person person=new Person();
		
		person.setId(2);
		person.setName("raju");
		person.setEmail("Raju@gmail.com");
		person.setPassword("raju@123");
		person.setSal(25000);
		person.setAge(78);
		
		PersonService personService=new PersonService();
		Person per= personService.updatePerson(person);
		if(per!=null) {
			System.out.println(" data updated");
		}
		else
		{
			System.out.println(" Plz check data");
		}
		
	}
}
