package part2.day1.impl;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {
	public static void main(String[] args) {
		Book myBook = new Book("something", 3000, "you");
		Book myBook2 = new Book("something2", 1, "me");
		
		List<Book> books = new ArrayList<>();
		books.add(myBook);
		books.add(myBook2);
		
		Library library = new Library();
		library.setBooks(books);
		library.setLibraryName("Your library");
		
		List<Measurable> measurables = new ArrayList<>();
		measurables.add(myBook);
		measurables.add(myBook2);
		measurables.add(library);
		
		for (Measurable measurable : measurables) {
			double measure = measurable.getMeasure();
			System.out.println(measure);
		}
		
		//
		List<NameGettable> nameGettables = new ArrayList<>();
		nameGettables.add(myBook);
		nameGettables.add(myBook2);
		nameGettables.add(library);
		
		for (NameGettable nameGettable : nameGettables) {
			String name = nameGettable.getName();
			System.out.println(name);
		}
		
		Book castedBook = (Book)nameGettables.get(0);
		System.out.println(castedBook.getPages());
				
	}

}
