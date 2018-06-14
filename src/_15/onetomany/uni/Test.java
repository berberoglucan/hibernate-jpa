package _15.onetomany.uni;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");

		EntityManager entityManager = factory.createEntityManager();
		
		User user = new User("can", "berberoglu");
		
		Product product = new Product("iphone7", 2500, 1);
		
		Product product2 = new Product("samsung", 2000, 1);
		
		List<Product> products = Arrays.asList(product, product2);
		
		user.setProduct(products);
		
		entityManager.getTransaction().begin();

		entityManager.persist(user);
		
		entityManager.remove(user);

		entityManager.getTransaction().commit();
		
	}
	
}
