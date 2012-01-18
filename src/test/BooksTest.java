package test;

import main.Books;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 1:54 PM
 */

@RunWith(Parameterized.class)
public class BooksTest {

	private String name = "";
	private String bookId = "";

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = Parameter.MOCK_BOOKS;
		return Arrays.asList(data);
	}

	public BooksTest(String bookID, String name) {
		this.name = name;
		this.bookId = bookID;

	}


	@Test
	public void testGetName() throws Exception {
		Books books = new Books(bookId, name);
		assertEquals(name, books.getName());
	}

	@Test
	public void testGetBookId() throws Exception {
		Books books = new Books(bookId, name);
		assertEquals(bookId, books.getBookId());
	}
}
