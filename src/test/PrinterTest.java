package test;


import main.Books;
import main.MenuItem;
import main.Printer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 2:00 PM
 */

@RunWith(Parameterized.class)
public class PrinterTest {


	private String bookId = "";
	private int questionId = 0;
	private String name = "";


	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = Parameter.MOCK_PRINTER;
		return Arrays.asList(data);
	}

	public PrinterTest(int questionID, String bookID, String name) {
		this.name = name;
		this.bookId = bookID;
		this.questionId = questionID;
	}

	@Test
	public void testPrintBooks() throws Exception {

		ArrayList<Books> books = new ArrayList<Books>();
		Printer print = new Printer();
		Books book = mock(Books.class);
		books.add(book);

		when(book.getBookId()).thenReturn(bookId);
		when(book.getName()).thenReturn(name);

		print.printBooks(books);

		assertEquals(book.getName(), name);
		assertEquals(book.getBookId(), bookId);


	}


	@Test
	public void testPrintMenu() throws Exception {
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
		Printer print = new Printer();
		MenuItem menuItem = mock(MenuItem.class);
		menu.add(menuItem);

		when(menuItem.getQuestion()).thenReturn(name);
		when(menuItem.getQuestionID()).thenReturn(questionId);

		print.printMenu(menu);

		assertEquals(menuItem.getQuestion(), name);
		assertEquals(menuItem.getQuestionID(), questionId);

	}

}
