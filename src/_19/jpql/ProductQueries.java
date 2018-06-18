package _19.jpql;

public class ProductQueries {
	
	public static final String FIND_PRODUCTS = "SELECT p FROM Product p";
	
	public static final String FIND_PRODUCT_BY_ID = "SELECT p FROM Product p WHERE p.productId = :productId";

	public static final String FIND_PRODUCT_DETAILS = "SELECT new _19.jpql.ProductDetails(p.productName, p.unitPrice, p.available, b.brandName, c.categoryName)"
			+ "FROM Product p LEFT JOIN p.brand b LEFT JOIN p.category c";

	public static final String FIND_PRODUCT_DETAILS2 = "SELECT new _19.jpql.ProductDetails(p.productName, p.unitPrice, p.available, p.brand.brandName, p.category.categoryName)"
			+ "FROM Product p";

	public static final String FIND_PRODUCT_DETAILS_BY_ID = "SELECT new _19.jpql.ProductDetails(p.productName, p.unitPrice, p.available, b.brandName, c.categoryName)"
			+ "FROM Product p LEFT JOIN p.brand b LEFT JOIN p.category c WHERE p.productId = :productId";

	public static final String FIND_PRODUCT_DETAILS_BY_ID2 = "SELECT new _19.jpql.ProductDetails(p.productName, p.unitPrice, p.available, p.brand.brandName, p.category.categoryName)"
			+ "FROM Product p  WHERE p.productId = :productId";
	
	public static final String FIND_PRODUCT_NAMES = "SELECT p.productName FROM Product p";
	
	public static final String FIND_PRODUCT_NAME_PRICE = "SELECT p.productName, p.unitPrice FROM Product p";
	
	public static final String FIND_GREAT_PRICE = "SELECT p FROM Product p WHERE p.unitPrice > :unitPrice";
	
	public static final String FIND_GREAT_LESS_PRICE = "SELECT p FROM Product p WHERE p.unitPrice > :minUnitPrice AND p.unitPrice < :maxUnitPrice";
	
	public static final String FIND_BETWEEN_PRICE = "SELECT p FROM Product p WHERE p.unitPrice BETWEEN :minUnitPrice AND :maxUnitPrice";
	
	public static final String FIND_LIKE_PRODUCT_NAME = "SELECT p FROM Product p WHERE p.productName LIKE :productName";
	
	public static final String FIND_IN_CATEGORY_NAME = "SELECT p FROM Product p LEFT JOIN p.category c WHERE c.categoryName IN(:categoryName1, :categoryName2)";
	
	public static final String FIND_IN_CATEGORY_NAME2 = "SELECT p FROM Product p WHERE p.category.categoryName IN(:categoryName1, :categoryName2)";
	
	public static final String FIND_FUNCTION_PRICE = "SELECT AVG(p.unitPrice), SUM(p.unitPrice), MAX(p.unitPrice), MIN(p.unitPrice), COUNT(p) FROM Product p";
	
	public static final String FIND_GROUP_BY_CATEGORY = "SELECT p.category.categoryName, AVG(p.unitPrice) FROM Product p GROUP BY p.category.categoryName";
	
	public static final String FIND_GROUP_BY_HAVING_CATEGORY = "SELECT p.category.categoryName AVG(p.unitPrice) FROM Product p GROUP BY p.category.categoryName HAVING AVG(p.unitPrice) > 500";
	
	public static final String FIND_ALL_PRODUCTS = "SELECT p FROM Product p WHERE p.unitPrice > ALL(SELECT p2.unitPrice FROM Product p2 WHERE p2.category.categoryId = :categoryId)";
	
	public static final String FIND_ORDER_BY_PRICE = "SELECT p FROM Product p ORDER BY p.unitPrice DESC";
	
	

}
