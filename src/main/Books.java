package main;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 3:45 AM
 */

public class Books {

	private String name = "";
	private String bookId = "";

	public Books(String bookId, String name) {
		this.name = name;
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public String getBookId() {
		return bookId;
	}

}
