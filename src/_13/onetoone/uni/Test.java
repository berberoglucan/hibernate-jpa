package _13.onetoone.uni;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("employeePersistence");
		
		EntityManager entityManager = managerFactory.createEntityManager();
		
		//Customer customer = new Customer("can", "berberoglu", new Date());
		
		//Customer customer2 = new Customer("cem", "berberoglu", new Date());
		
		//Adress address = new Adress("karaagac", "istanbul", 34200);
		
		Customer customer1 = entityManager.find(Customer.class, 1);
		
		Customer customer2 = entityManager.find(Customer.class, 2);
		
		Adress adress = entityManager.find(Adress.class, 1);
		
		
		entityManager.getTransaction().begin();
		
		// entityManager.persist(customer);
		// entityManager.persist(customer2);
		
		// entityManager.persist(address);
		
		// customer1.setAddress(adress);
		
		customer2.setAddress(adress);
		
		entityManager.getTransaction().commit();
		
	}

}
