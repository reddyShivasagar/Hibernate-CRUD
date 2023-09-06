package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class DeletePerson {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		Person per=personService.deletePerson(5);
		if(per!=null) {
			System.out.println(" Data deleted");
		}
		else {
			System.out.println(" Plz check data");
		}
	}
}
 