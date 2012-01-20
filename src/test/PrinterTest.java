package test;


import main.mainlibrary.MenuItem;
import main.mainlibrary.Printer;
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
	public void testPrintProducts() throws Exception {

		ArrayList<main.product.ProductIntf> prd = new ArrayList<main.product.ProductIntf>();
		main.product.ProductIntf book = mock(main.product.Books.class);
		prd.add(book);

		when(book.getId()).thenReturn(bookId);
		when(book.getName()).thenReturn(name);

		Printer.printProduct(prd);

		assertEquals(book.getName(), name);
		assertEquals(book.getId(), bookId);


	}


	@Test
	public void testPrintMenu() throws Exception {
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
		MenuItem menuItem = mock(MenuItem.class);
		menu.add(menuItem);

		when(menuItem.getQuestion()).thenReturn(name);
		when(menuItem.getQuestionID()).thenReturn(questionId);

		Printer.printMenu(menu);

		assertEquals(menuItem.getQuestion(), name);
		assertEquals(menuItem.getQuestionID(), questionId);

	}

}
