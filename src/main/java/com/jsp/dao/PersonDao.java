package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {

	public Person savePerson(Person person) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sagar");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		if(person!=null) {
			et.begin();
			em.persist(person);
			et.commit();
			return person;
		}
		return null;
	}
	
	public Person updatePerson(Person person) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sagar");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		if(person!=null) {
			et.begin();
			em.merge(person);
			et.commit();
			return person;
		}
		return null;
	}
	
	public Person deletePerson(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sagar");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person person=em.find(Person.class,id);
		
		if(person!=null) {
		et.begin();
		em.remove(person);
		et.commit();
		return person;
	}
	return null;
	}
	
	public Person getPersonById(int id) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sagar");
		EntityManager em=emf.createEntityManager();
		
		return em.find(Person.class,id);
	}
		
	public List<Person> getAllPerson() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sagar");
		EntityManager em=emf.createEntityManager();
		
       Query query=em.createQuery("select alias from Person alias");
       
		return query.getResultList();
 	
	 }	
	
	 public Person loginPerson(String email,String password) {
			
	  		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sagar");
	  	    EntityManager em=emf.createEntityManager();
	  		
	         Query query=em.createQuery("select alias from Person alias where alias.email=?1 and alias.password=?2");
	         query.setParameter(1, email);
	         query.setParameter(2, password);
	         List<Person> list=query.getResultList();
	         
	         for(Person person:list) {
	  		 
	        	 return person;
	         }
	         return null;
	  	}
}

