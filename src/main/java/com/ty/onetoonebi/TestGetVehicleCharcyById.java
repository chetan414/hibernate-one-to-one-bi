package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVehicleCharcyById {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Vehicle vehicle = entityManager.find(Vehicle.class, 1);

		if (vehicle != null) {
			System.out.println("Vehicle ID: " + vehicle.getId());
			System.out.println("Vehicle Name: " + vehicle.getName());
			System.out.println("Vehicle Cost: " + vehicle.getCost());
			System.out.println("---------------------------------------");
			Charcy charcy = vehicle.getCharcy();
			System.out.println("Charcy ID: "+charcy.getId());
			System.out.println("Charcy Number: "+charcy.getCharcyNumber());
			System.out.println("charcy Type: "+charcy.getType());
		} else {
			System.out.println("Data you are looking for is not available");
		}
	}
}
