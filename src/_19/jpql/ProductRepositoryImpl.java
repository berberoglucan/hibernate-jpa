package _19.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ProductRepositoryImpl implements ProductRepository {

	private EntityManager entityManager;

	public ProductRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Product saveProduct(Product product) {

		entityManager.getTransaction().begin();

		entityManager.persist(product);

		entityManager.getTransaction().commit();

		return product;
	}

	@Override
	public Brand saveBrand(Brand brand) {

		entityManager.getTransaction().begin();

		entityManager.persist(brand);

		entityManager.getTransaction().commit();

		return brand;
	}

	@Override
	public Category saveCategory(Category category) {

		entityManager.getTransaction().begin();

		entityManager.persist(category);

		entityManager.getTransaction().commit();

		return category;

	}

	@Override
	public List<Product> findProducts() {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_PRODUCTS, Product.class);

		return query.getResultList();
	}

	@Override
	public List<Product> findProductsEntities(int firstResult, int maxResult) {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_PRODUCTS, Product.class);

		// kac tane kayit getirilsin diye ayarlama yapabiliriz.
		query.setFirstResult(firstResult);

		query.setMaxResults(maxResult);

		return query.getResultList();
	}

	@Override
	public Product findProductById(int productId) {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_PRODUCT_BY_ID, Product.class)
				.setParameter("productId", productId);

		return query.getSingleResult();

	}

	@Override
	public List<ProductDetails> findProductDetails() {

		TypedQuery<ProductDetails> query = entityManager.createQuery(ProductQueries.FIND_PRODUCT_DETAILS2,
				ProductDetails.class);

		return query.getResultList();

	}

	@Override
	public ProductDetails findProductDetaisById(int productId) {

		TypedQuery<ProductDetails> query = entityManager
				.createQuery(ProductQueries.FIND_PRODUCT_DETAILS_BY_ID2, ProductDetails.class)
				.setParameter("productId", productId);

		return query.getSingleResult();

	}

	@Override
	public List<String> findProductsName() {

		TypedQuery<String> query = entityManager.createQuery(ProductQueries.FIND_PRODUCT_NAMES, String.class);

		return query.getResultList();
	}

	@Override
	public List<Object[]> findProductsNameAndPrice() {

		TypedQuery<Object[]> query = entityManager.createQuery(ProductQueries.FIND_PRODUCT_NAME_PRICE, Object[].class);

		return query.getResultList();

	}

	@Override
	public List<Product> findGreatPrice(double unitPrice) {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_GREAT_PRICE, Product.class)
				.setParameter("unitPrice", unitPrice);

		return query.getResultList();

	}

	@Override
	public List<Product> findGreatAndLessPrice(double minUnitPrice, double maxUnitPrice) {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_GREAT_LESS_PRICE, Product.class)
				.setParameter("minUnitPrice", minUnitPrice).setParameter("maxUnitPrice", maxUnitPrice);

		return query.getResultList();

	}

	@Override
	public List<Product> findBetweenPrice(double minUnitPrice, double maxUnitPrice) {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_BETWEEN_PRICE, Product.class)
				.setParameter("minUnitPrice", minUnitPrice).setParameter("maxUnitPrice", maxUnitPrice);

		return query.getResultList();

	}

	@Override
	public List<Product> findLikeProductName(String productName) {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_LIKE_PRODUCT_NAME, Product.class)
				.setParameter("productName", "%" + productName + "%");
		return query.getResultList();

	}

	@Override
	public List<Product> findInCategoryName(String categoryName1, String categoryName2) {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_IN_CATEGORY_NAME2, Product.class)
				.setParameter("categoryName1", categoryName1).setParameter("categoryName2", categoryName2);

		return query.getResultList();

	}

	@Override
	public List<Product> findAllProductByCategoryId(int categoryId) {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_ALL_PRODUCTS, Product.class)
				.setParameter("categoryId", categoryId);
		return query.getResultList();

	}

	@Override
	public List<Object[]> findFunctionsPrice() {

		TypedQuery<Object[]> query = entityManager.createQuery(ProductQueries.FIND_FUNCTION_PRICE, Object[].class);

		return query.getResultList();

	}

	@Override
	public List<Object[]> findGroupByCategory() {

		TypedQuery<Object[]> query = entityManager.createQuery(ProductQueries.FIND_GROUP_BY_CATEGORY, Object[].class);

		return query.getResultList();

	}

	@Override
	public List<Object[]> findGroupByHavingCategory() {

		TypedQuery<Object[]> query = entityManager.createQuery(ProductQueries.FIND_GROUP_BY_HAVING_CATEGORY,
				Object[].class);

		return query.getResultList();

	}

	@Override
	public List<Product> findOrderByPrice() {

		TypedQuery<Product> query = entityManager.createQuery(ProductQueries.FIND_ORDER_BY_PRICE, Product.class);

		return query.getResultList();

	}

}
