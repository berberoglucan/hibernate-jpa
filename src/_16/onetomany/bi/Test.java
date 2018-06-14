package _16.onetomany.bi;


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
		
		user.getProduct().add(product);
		product.setUser(user);
		
		user.getProduct().add(product2);
		product2.setUser(user);
		
		entityManager.getTransaction().begin();

		entityManager.persist(product);
		entityManager.persist(product2);
		
		entityManager.getTransaction().commit();
		
		Product product3 = entityManager.find(Product.class, 1);
		
		
		System.out.println(product3.getUser().getFirstName());
		
		User user2 = entityManager.find(User.class, 1);
		
		System.out.println(user2.getProduct());
		
		
	}
	
}
