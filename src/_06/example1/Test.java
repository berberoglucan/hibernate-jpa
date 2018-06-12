package _06.example1;

import java.util.Calendar;
import java.util.Date;

import _00.model.Book;

public class Test {

	public static void main(String[] args) {
		
		BookRepository bookRepository  = new BookRepositoryImpl();
		
		
		Book book = new Book(100, "Harry Potter", 560, "Fantastic", "J.K. Rowling", createCustomDate(24, 12, 1998));
		
		Book book2 = new Book(200, "Lord of the Rings", 800, "Fantastic", "Tolkien" ,createCustomDate(12, 6, 1940));
		
		
		bookRepository.save(book);
		
		bookRepository.save(book2);
		
		Book findedBook = bookRepository.find(100);
		
		System.out.println(findedBook);
		
		findedBook.setPublisherDate(createCustomDate(10, 10, 2010));
		findedBook.setAuthorName("Rowling");
		
		bookRepository.update(findedBook);
		
		bookRepository.delete(100);
		
	}
	
	public static Date createCustomDate(int day, int month, int year) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.DAY_OF_MONTH, day);
		
		calendar.set(Calendar.MONTH, month-1);
		
		calendar.set(Calendar.YEAR, year);
		
		
		return calendar.getTime();
		
	}

}
