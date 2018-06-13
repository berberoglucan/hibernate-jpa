package _07.generatedvalue;

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

		Student student1 = new Student("can", "berberoglue", new Date());
		
		Student student2 = new Student("cem", "berberoglu", new Date()); 
		
		transaction.begin();

		entityManager.persist(student1);
		
		entityManager.persist(student2);

		transaction.commit();
	}
	
}
