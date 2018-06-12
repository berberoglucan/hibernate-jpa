package _05.remove;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _00.model.Product;

public class TestRemove {

	public static void main(String[] args) {
		
EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Product product = entityManager.find(Product.class, 100);
		
		transaction.begin();
		
		entityManager.remove(product);
		
		transaction.commit();
		
	}
	
}
