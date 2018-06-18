package _19.jpql;

import java.util.List;

public interface ProductRepository {

	Product saveProduct(Product product);
	
	Brand saveBrand(Brand brand);
	
	Category saveCategory(Category category);
	
	List<Product> findProducts();
	
	List<Product> findProductsEntities(int firstResult, int maxResult);
	
	Product findProductById(int productId);
	
	List<ProductDetails> findProductDetails();
	
	ProductDetails findProductDetaisById(int productId);
	
	List<String> findProductsName();
	
	List<Object[]> findProductsNameAndPrice();
	
	List<Product> findGreatPrice(double unitPrice);
	
	List<Product> findGreatAndLessPrice(double minUnitPrice, double maxUnitPrice);
	
	List<Product> findBetweenPrice(double minUnitPrice, double maxUnitPrice);
	
	List<Product> findLikeProductName(String productName);
	
	List<Product> findInCategoryName(String categoryName1, String categoryName2);
	
	List<Product> findAllProductByCategoryId(int categoryId);
	
	List<Object[]> findFunctionsPrice();
	
	List<Object[]> findGroupByCategory();
	
	List<Object[]> findGroupByHavingCategory();
	
	List<Product> findOrderByPrice();
	
}
