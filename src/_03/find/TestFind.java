package _03.find;

import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import _00.model.Product;

public class TestFind {

	public static void main(String[] args) {
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeePersistence");
		
		EntityManager entityManager = factory.createEntityManager();
		
		Product product = entityManager.find(Product.class, 100);
		
		if(product != null) 
			System.out.println(product);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date = dateFormat.format(product.getAddDate());
		System.out.println(date);
		
	}

}
