package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPerson {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class, 1);
		
		System.out.println("Person ID: "+person.getId());
		System.out.println("Person Name: "+person.getName());
		System.out.println("Person Email: "+person.getEmail());
		System.out.println("Person Phone: "+person.getPhone());
		System.out.println("==================================");
		Pan pan = person.getPan();
		
		System.out.println("Pan ID: "+pan.getId());
		System.out.println("Pan Address: "+pan.getAddress());
		System.out.println("Pan Number: "+ pan.getPanNumber());
	}
}
