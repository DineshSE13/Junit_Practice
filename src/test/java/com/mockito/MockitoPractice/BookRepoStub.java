package com.mockito.MockitoPractice;

import java.util.ArrayList;
import java.util.List;

import stub.Book;
import stub.Bookrepo;

public class BookRepoStub implements Bookrepo {

	@Override
	public List<Book> findnewbooks(int days) {
		List<Book> newbooks = new ArrayList<>();
		Book b1 = new Book("001","Let us c",500);
		Book b2 = new Book("002","Let us c++",400);
		
		newbooks.add(b1);
		newbooks.add(b2);
		
		return newbooks;
	}



}
