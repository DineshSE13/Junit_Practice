package com.mockito.MockitoPractice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.mockito.Mockito;

public class FakeTest {

	@Test
	public void faketest() {
		BookRepo bookrepo = new FakeBookRepo();
		BookService bookservice = new BookService(bookrepo);

		bookservice.add(new Book("01", "let us c", 100));
		bookservice.add(new Book("02", "let us c++", 10000));
		assertEquals(2, bookservice.findsize());
	}

	@Test

	public void withmockitofake() {
		BookRepo bookrepo = Mockito.mock(BookRepo.class);
		BookService bookservice = new BookService(bookrepo);

		Collection<Book> books = new ArrayList<>();
		Book b1 = new Book("01", "let us c", 100);
		Book b2 = new Book("01", "let us c++", 100);
		books.add(b2);
		books.add(b1);
		Mockito.when(bookrepo.findall()).thenReturn(books);
		assertEquals(2, bookservice.findsize());
	}
}
