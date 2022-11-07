package com.mockito.MockitoPractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import spy.BookService;
import spy.Book;

public class SpyTest {

	@Test
	public void demospy() {
		Bookrepospy bookrepospy = new Bookrepospy();
		BookService bookservice = new BookService(bookrepospy);

		Book b1 = new Book("001", "Let us c", 500);
		Book b2 = new Book("002", "Let us c++", 400);
		
		bookservice.addbok(b1);
		bookservice.addbok(b2);
		
		assertEquals(2, bookrepospy.timescalled());

		assertTrue(bookrepospy.calledwith(b2));
	}
}
