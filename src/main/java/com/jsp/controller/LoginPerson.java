package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class LoginPerson {
public static void main(String[] args) {
	PersonService personService=new PersonService();
	Person person=personService.loginPerson("shivasagay@gmail.com", "reddy122");
	
	if(person!=null) {
		System.out.println("Data fetched");
	}
	else {
		System.out.println("Failed to fetched");
	}
}
}
