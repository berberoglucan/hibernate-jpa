package _02.persist;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _00.model.Product;

public class PersistTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Product product = new Product(100, "Iphone 7", 3100, 2, new Date(), null);
		
		transaction.begin();
		
		entityManager.persist(product);
		
		transaction.commit();
	}

}
