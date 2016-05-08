package part2.day1.impl;

public class Book implements Measurable, NameGettable {
	public Book() {
		super();
	}
	
	public Book(String bookName, int pages, String authorName) {
		super();
		this.bookName = bookName;
		this.pages = pages;
		this.authorName = authorName;
	}
	
	private String bookName;
	private int pages;
	private String authorName;
	
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public double getMeasure() {
		return this.getPages();
	}

	@Override
	public String getName() {
		return this.getBookName();
	}
	
}
