package Code;

import java.util.ArrayList;

public class ShopCart {
	ArrayList<Book> books ;
	public ShopCart() {
		// TODO Auto-generated constructor stub
		books = new ArrayList<Book>();
	}
	public int getBookCount() {
		// TODO Auto-generated method stub
		return books.size();
	}

	public void add(Book book1) {
		// TODO Auto-generated method stub
		books.add(book1);
		
	}
	public int getPrice() {
		// TODO Auto-generated method stub
		int price = 0 ;
		for(int i = 0  ; i < books.size() ; i++)
			price += books.get(i).getPrice();
		return price;
	}

}
