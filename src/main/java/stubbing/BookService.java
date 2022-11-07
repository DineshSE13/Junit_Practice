package stubbing;

import java.util.List;

public class BookService {
	
	private Bookrepo bookrepo;

	public BookService(Bookrepo bookrepo) {
		this.bookrepo = bookrepo;
	}
	
	public List<Book> getnewdiscountedbook(int rate, int days){
		List<Book> newbook = bookrepo.findnewbooks(days);
		
		for(Book book: newbook) {
			int price = book.getPrice();
			int newprice = price-(rate*price/100); 
			book.setPrice(newprice);
		}
		
		return newbook;
	}
	
	public int totalcost(List<String> bookid) {
		
		int total = 0;
		for(String bookids: bookid) {
			Book book = bookrepo.findbookbyid(bookids);
			total+=book.getPrice();
		}
		return total;
	}
	
}
