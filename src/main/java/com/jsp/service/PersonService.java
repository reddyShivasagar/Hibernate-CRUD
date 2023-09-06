package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

       public class PersonService {
    	   
	   PersonDao persondao=new PersonDao();//CReating PersonDao object
	
       
	   public Person savePerson(Person person) {
		
		   return persondao.savePerson(person);
       }
       
       public Person updatePerson(Person person) {
   		
   		  return persondao.updatePerson(person);
       }
       
       public Person deletePerson(int id) {
		
    	  return persondao.deletePerson(id);
    	   
       }

	   public Person getPersonById(int id) {
		
		  return persondao.getPersonById(id);
	   }
	   
	   public List <Person> getAllPerson() {
		
		   return persondao.getAllPerson();
	   }
	   public Person loginPerson(String email,String password) {
		   return persondao.loginPerson(email, password);
	   }
	   
}
