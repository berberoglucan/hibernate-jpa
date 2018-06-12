package _01.entity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");
		
		// EntityManager entityManager = factory.createEntityManager();
		
		factory.createEntityManager();
	}

}
