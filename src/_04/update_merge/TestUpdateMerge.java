package _04.update_merge;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _00.model.Product;

public class TestUpdateMerge {

	public static void main(String[] args) {
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Product product = entityManager.find(Product.class, 100);
		
		// way 1
		transaction.begin();
		
		product.setUnitPrice(3500);
		product.setUpdateDate(new Date());
		
		transaction.commit();
		
		
		// way 2 
		
		product = entityManager.find(Product.class, 100);
		
		product.setUpdateDate(new Date());
		product.setName("Iphone 8");
		product.setUnitPrice(4000);
		
		transaction.begin();
		
		entityManager.merge(product);
		
		transaction.commit();
		
		
		
	}

}
