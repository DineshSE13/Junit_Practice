package com.mockito.MockitoPractice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import stub.Bookrepo;
import stub.BookService;
import stub.Book;

public class StubTest {

	@Test

	public void stubtest() {
		Bookrepo bookrepo = new BookRepoStub();
		BookService bs = new BookService(bookrepo);

		List<Book> newdicountbook = bs.getnewdiscountedbook(10, 7);
		assertEquals(2, newdicountbook.size());
		assertEquals(450, newdicountbook.get(0).getPrice());
		assertEquals(360, newdicountbook.get(1).getPrice());

	}

	@Test

	public void stubtestwithmockito() {
		Bookrepo bookrepo = Mockito.mock(Bookrepo.class);
		BookService bookservice = new BookService(bookrepo);

		List<Book> books = new ArrayList<>();
		Book b1 = new Book("01", "let us c", 500);
		Book b2 = new Book("01", "let us c++", 400);
		books.add(b1);
		books.add(b2);

		Mockito.when(bookrepo.findnewbooks(7)).thenReturn(books);
		List<Book> newbook = bookservice.getnewdiscountedbook(10, 7);
		assertEquals(2, newbook.size());
		assertEquals(450, newbook.get(0).getPrice());
		assertEquals(360, newbook.get(1).getPrice());
	}
}
