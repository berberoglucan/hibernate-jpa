package _08.embeddable;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestEmbeddable {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Contact contact = new Contact("55555555", "can@gmail.com", "can.com");
		
		User user = new User("can", "123", contact, new Date());
		
		transaction.begin();
		
		entityManager.persist(user);
		
		transaction.commit();
	}

}
