package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetAllPerson {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		
		List<Person> list=personService.getAllPerson();
		
		for(Person person:list) {
			
			System.out.println(" Person id:"+person.getId());
			System.out.println(" Person name:"+person.getName());
			System.out.println(" Person email:"+person.getEmail());
			System.out.println(" Person paasword:"+person.getPassword());
			System.out.println(" Person sal:"+person.getSal());
			System.out.println(" Person age:"+person.getAge());
			System.out.println(" =========================================");
		
		}
	}
	
}
