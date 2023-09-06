package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetPersonById {

	public static void main(String[] args) {
		PersonService personService=new PersonService();
		
		Person person=personService.getPersonById(0);
		if(person!=null) {
			
			System.out.println(" Person id: "+person.getId());
			System.out.println(" Person name: "+person.getName());
			System.out.println(" Person email: "+person.getEmail());
			System.out.println(" Person password: "+person.getPassword());
			System.out.println(" Person sal: "+person.getSal());
			System.out.println(" Person age: "+person.getAge());
			System.out.println("===========================================");
			
		}
	}
}
