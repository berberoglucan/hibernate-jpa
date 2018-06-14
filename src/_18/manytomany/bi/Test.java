package _18.manytomany.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");

		EntityManager entityManager = factory.createEntityManager();

		University university = new University("dumlupinar");

		University university2 = new University("osman gazi");

		Student student = new Student("can", "berberoglu");

		Student student2 = new Student("cem", "berberoglu");

		student.getUniversities().add(university);

		university.getStudents().add(student);

		student.getUniversities().add(university2);

		university2.getStudents().add(student);

		student2.getUniversities().add(university2);

		university2.getStudents().add(student2);

		entityManager.getTransaction().begin();

		entityManager.persist(university);

		entityManager.persist(university2);

		entityManager.persist(student);

		entityManager.persist(student2);

		entityManager.getTransaction().commit();

	}

}
