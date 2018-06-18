package _19.jpql;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Test {

	private static EntityManager entityManager = Persistence.createEntityManagerFactory("employeePersistence")
			.createEntityManager();

	private static ProductRepository productRepository = new ProductRepositoryImpl(entityManager);

	public static void main(String[] args) {

		// insertData();

		
		/*
		"SELECT p FROM Product p" 
		List<Product> products = productRepository.findProducts();
		  
		products.forEach(System.out::println);
		*/
		
		// SELECT p FROM Product p WHERE p.productId = :productId
		/* 
		Product product = productRepository.findProductById(5);
		
		System.out.println(product);
		*/
		
		
		// "SELECT new _19.jpql.ProductDetails(p.productName, p.unitPrice, p.available, p.brand.brandName, p.category.categoryName) FROM Product p";
		
		/*List<ProductDetails> details = productRepository.findProductDetails();
		
		details.forEach(System.out::println); */
		
		
		// "SELECT new _19.jpql.ProductDetails(p.productName, p.unitPrice, p.available, p.brand.brandName, p.category.categoryName) FROM Product p  WHERE p.productId = :productId"
		/*ProductDetails detail = productRepository.findProductDetaisById(5);
		
		System.out.println(detail); */
		
		
		// "SELECT p.productName FROM Product p";
		/* List<String> productNames = productRepository.findProductsName();
		
		productNames.forEach(System.out::println); */
		
		
		//SELECT p.productName, p.unitPrice FROM Product p
		/* List<Object[]> list  = productRepository.findProductsNameAndPrice();
		
		for (Object[] objects : list) {
			System.out.println(objects[0] + " " + objects[1]);
		} */
		
		/*List<Product> products = productRepository.findGreatPrice(3000);
		
		products.forEach(System.out::println);*/
		
		/*List<Product> products = productRepository.findGreatAndLessPrice(3000, 5000);
		
		products.forEach(System.out::println);*/
		
		/* List<Product> products = productRepository.findBetweenPrice(3000, 5000);
		
		products.forEach(System.out::println); */
		
		
		/* List<Product> products = productRepository.findLikeProductName("mac");
		
		products.forEach(System.out::println); */
		
		/* List<Product> products = productRepository.findInCategoryName("Bilgisayar", "Tablet");
		
		products.forEach(System.out::println); */
		
		
		/* List<Object[]> products = productRepository.findFunctionsPrice();
		
		for (Object[] objects : products) {
			System.out.println(objects[0] + " " + objects[1] + " " + objects[2] + " " + objects[3]);
		} */
		
		 /*List<Object[]> products = productRepository.findGroupByCategory();
			
			for (Object[] objects : products) {
				System.out.println(objects[0] + " " + objects[1]);
			}*/
		
		/* List<Product> product = productRepository.findProductsEntities(0, 3);
		
		product.forEach(System.out::println); */
		 

	}

	public static void insertData() {
		Brand brand2 = new Brand("LG");
		Brand brand3 = new Brand("SONY");
		Brand brand1 = new Brand("APPLE");
		Brand brand4 = new Brand("SAMSUNG");
		Brand brand5 = new Brand("ASUS");

		Category category1 = new Category("Bilgisayar");
		Category category2 = new Category("Tablet");
		Category category3 = new Category("Telefon");

		Product product1 = new Product("Ýphone 7", 3500, 2, brand1, category3, new Date());
		Product product2 = new Product("LG G3", 2500, 1, brand2, category3, new Date());
		Product product3 = new Product("Sony Expeia", 2700, 1, brand3, category3, new Date());

		Product product4 = new Product("Samsung Z500", 1700, 1, brand4, category1, new Date());
		Product product5 = new Product("Mac i5", 4100, 1, brand1, category1, new Date());
		Product product6 = new Product("ASUS Ý7", 3100, 2, brand5, category1, new Date());

		Product product7 = new Product("Galaxy Tablet", 2300, 1, brand4, category2, new Date());
		Product product8 = new Product("iPad", 2600, 3, brand5, category2, new Date());
		Product product9 = new Product("Sony Tablet", 2400, 1, brand3, category2, new Date());

		productRepository.saveBrand(brand1);
		productRepository.saveBrand(brand2);
		productRepository.saveBrand(brand3);
		productRepository.saveBrand(brand4);
		productRepository.saveBrand(brand5);

		productRepository.saveCategory(category1);
		productRepository.saveCategory(category2);
		productRepository.saveCategory(category3);

		productRepository.saveProduct(product1);
		productRepository.saveProduct(product2);
		productRepository.saveProduct(product3);
		productRepository.saveProduct(product4);
		productRepository.saveProduct(product5);
		productRepository.saveProduct(product6);
		productRepository.saveProduct(product7);
		productRepository.saveProduct(product8);
		productRepository.saveProduct(product9);

	}

}
