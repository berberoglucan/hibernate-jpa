package _14.onetoone.bi;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");

		EntityManager entityManager = factory.createEntityManager();

		Customer customer1 = new Customer("can", "berberoglu", new Date());

		Adress adress = new Adress("karaagac", "istanbul", 34200);
		
		customer1.setAddress(adress);

		entityManager.getTransaction().begin();

		entityManager.persist(adress);

		entityManager.persist(customer1);
		
		Adress adress1 = entityManager.find(Adress.class, 1);
		
		System.out.println(adress1.getCustomer().getFirstName());

		entityManager.getTransaction().commit();
		
		

	}

}
