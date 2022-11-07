package com.mockito.MockitoPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepo implements BookRepo {

	Map<String, Book> bookstore = new HashMap<>();

	@Override
	public void save(Book book) {
		bookstore.put(book.getId(), book);
	}

	@Override
	public Collection<Book> findall() {

		return bookstore.values();

	}

}
