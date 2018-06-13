package _10.elementCollection.list2;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		User user = new User("can", "berberoglu", new Date());
		
		user.getAddresses().add(new Adress("istanbul", "karaagac sok", "turkey"));
		
		user.getAddresses().add(new Adress("tekirdag", "sallama", "turkey"));

		transaction.begin();

		entityManager.persist(user);

		transaction.commit();

	}

}
