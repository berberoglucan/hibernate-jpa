package _09.elementCollection.list;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestElementCollection {

	public static void main(String[] args) {

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Personel personel = new Personel("can", "berberoglu", new Date());
		
		personel.addPhoneNumber("2222");
		
		personel.addPhoneNumber("111111", "2222222", "122231111");
		
		transaction.begin();
		
		entityManager.persist(personel);
		
		transaction.commit();
	}

}
