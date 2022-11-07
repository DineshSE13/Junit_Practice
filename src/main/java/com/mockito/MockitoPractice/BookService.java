package com.mockito.MockitoPractice;

public class BookService {
	
	private BookRepo bookrepo;


	
	public void add(Book book) {
		bookrepo.save(book);
		
	}
	public BookService(BookRepo bookrepo) {
		super();
		this.bookrepo = bookrepo;
	}
	public int findsize() {
		return bookrepo.findall().size();
	}
}
