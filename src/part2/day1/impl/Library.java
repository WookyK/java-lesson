package part2.day1.impl;

import java.util.List;

public class Library implements Measurable, NameGettable {
	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	private String libraryName;
	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public double getMeasure() {
		return books.size();
	}

	@Override
	public String getName() {
		return this.getLibraryName();
	}
	
}
