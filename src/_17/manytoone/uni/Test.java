package _17.manytoone.uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");

		EntityManager entityManager = factory.createEntityManager();

		Department department = new Department("IT", 2000, 5000);

		Employee employee = new Employee("can", "berberoglu");

		Employee employee2 = new Employee("cem", "berberoglu");

		employee.setDepartment(department);

		employee2.setDepartment(department);

		entityManager.getTransaction().begin();

		entityManager.persist(employee);

		entityManager.persist(employee2);

		// entityManager.remove(employee);
		Department department2 = entityManager.find(Department.class, 1);

		entityManager.remove(department2);
		entityManager.getTransaction().commit();
		
		
	}
	
}
