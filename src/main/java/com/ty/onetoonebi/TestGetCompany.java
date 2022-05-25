package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompany {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Company company = entityManager.find(Company.class, 1);
		
		System.out.println("Company ID: "+company.getId());
		System.out.println("Comapny Name: "+company.getName());
		System.out.println("Company Website: "+company.getWeb());
		
		System.out.println("=======================================");
		
		Gst gst = company.getGst();
		
		System.out.println("GST ID: "+gst.getId());
		System.out.println("GST Number: "+gst.getGstNumber());
		System.out.println("GST State: "+gst.getState());
	}
}
