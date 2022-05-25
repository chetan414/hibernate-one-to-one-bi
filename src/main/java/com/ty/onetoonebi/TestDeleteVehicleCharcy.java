package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteVehicleCharcy {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = entityManager.find(Vehicle.class, 2);

		if (vehicle != null) {
			Charcy charcy = vehicle.getCharcy();
			if (charcy != null) {
				entityTransaction.begin();
				entityManager.remove(vehicle);
				entityTransaction.commit();
				System.out.println("Data is deleted successfully");
			} else {
				System.out.println("Data is not available");
			}
		} else {
			System.out.println("Data is not available");
		}
	}
}
