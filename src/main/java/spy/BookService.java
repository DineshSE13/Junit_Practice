package spy;

import spy.Bookrepo;
import spy.Book;

public class BookService {

	private Bookrepo bookrepo;

	public BookService(Bookrepo bookrepo) {
		this.bookrepo = bookrepo;
	}
	public void addbok(Book book) {
		bookrepo.save(book);
	}

}
