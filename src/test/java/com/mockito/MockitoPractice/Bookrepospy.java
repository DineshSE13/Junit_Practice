package com.mockito.MockitoPractice;

import java.util.List;

import spy.Book;
import spy.Bookrepo;

class Bookrepospy implements Bookrepo {

	int savecalled = 0;
	Book lastaddedbook = null;

	@Override
	public void save(Book book) {
		savecalled++;
		lastaddedbook = book;
	}
	
	public int timescalled() {
		return savecalled;
	}
	
	public boolean calledwith(Book book) {
		return lastaddedbook.equals(book);
	}

}
