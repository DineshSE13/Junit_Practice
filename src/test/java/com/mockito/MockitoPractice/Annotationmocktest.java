package com.mockito.MockitoPractice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import annotations.Book;
import annotations.Bookrepo;
import annotations.BookService;

@RunWith(MockitoJUnitRunner.class)
public class Annotationmocktest {

	@InjectMocks
	private BookService bookservice;

	@Mock
	private Bookrepo bookrepo;

	//Another way to create mockito
//	@Before
//	public void beforetest() {
//		MockitoAnnotations.initMocks(this);
//	}

	@Test
	public void mocktestwithannotation() {

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
