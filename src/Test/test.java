package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.Book;
import Code.ShopCart;

public class test {

	@Test
	public void case1test() {
		ShopCart cart = new ShopCart();
		int bookCount = 0  ;
		assertTrue(bookCount == cart.getBookCount());
	}
	@Test
	public void case2test() {
		ShopCart cart = new ShopCart();
		Book  book1 = new Book();
		book1.setName("Java");
		book1.setPrice(127);
		cart.add(book1);
		int bookCount = 1  ;
		int Price = 127 ;
		assertTrue(bookCount == cart.getBookCount());
		assertTrue(Price == cart.getPrice()); 
	}
	@Test
	public void case3test() {
		ShopCart cart = new ShopCart();
		Book  book1 = new Book();
		book1.setName("Java");
		book1.setPrice(127);
		Book  book2 = new Book();
		book2.setName("Web Design");
		book2.setPrice(100);
		cart.add(book1);
		cart.add(book2);
		int bookCount = 2  ;
		int Price = 227 ;
		assertTrue(bookCount == cart.getBookCount());
		assertTrue(Price == cart.getPrice()); 
	}
}
