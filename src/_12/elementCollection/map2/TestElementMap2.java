package _12.elementCollection.map2;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestElementMap2 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		Personel personel = new Personel("can", "berberoglu", new Date());

		personel.addPhoneNumber(PhoneType.HOME, "111111111");

		personel.addPhoneNumber(PhoneType.WORK, "123222223");

		transaction.begin();

		entityManager.persist(personel);

		transaction.commit();
	}

}
