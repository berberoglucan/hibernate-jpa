package _06.example1;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import _00.model.Book;

public class BookRepositoryImpl implements BookRepository{
	
	private EntityManager entityManager;
	
	private static final String PERSISTANCE_UNIT = "employeePersistence";
	
	public BookRepositoryImpl() {
		this.entityManager = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT).createEntityManager();
	}

	@Override
	public void save(Book book) {
		entityManager.getTransaction().begin();
		entityManager.persist(book);
		entityManager.getTransaction().commit();
	}

	@Override
	public void delete(int id) {
		Book book = find(id);
		entityManager.getTransaction().begin();
		entityManager.remove(book);
		entityManager.getTransaction().commit();
	}

	@Override
	public Book find(int id) {
		Book book = entityManager.find(Book.class, id);
		if(book != null)
			return book;
		return null;
	}

	@Override
	public Book update(Book book) {
		entityManager.getTransaction().begin();
		Book updatedBook = entityManager.merge(book);
		entityManager.getTransaction().commit();
		return updatedBook;
	}

	
	
}
