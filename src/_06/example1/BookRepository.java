package _06.example1;

import _00.model.Book;

public interface BookRepository {
	
	void save(Book book);
	
	void delete(int id);
	
	Book find(int id);
	
	Book update(Book book);
	
}
