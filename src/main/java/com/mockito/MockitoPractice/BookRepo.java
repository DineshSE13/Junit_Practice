package com.mockito.MockitoPractice;

import java.util.Collection;

public interface BookRepo {
	public void save(Book book);

	public Collection<Book> findall();
}
