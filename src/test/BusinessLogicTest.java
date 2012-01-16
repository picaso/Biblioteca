package test;


import main.Books;
import main.BusinessLogic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by IntelliJ IDEA.
 * User: Osaide Ogbeifun       ...
 * Date: 1/15/12
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(Parameterized.class)
public class BusinessLogicTest {

    private String name = "";
    private String bookId = "";

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = Parameter.MOCK_BOOKS;
        return Arrays.asList(data);
    }

    public BusinessLogicTest(String bookID, String name) {
        this.name = name;
        this.bookId = bookID;

    }

    @Test
    public void testReserveBook() throws Exception {
        ArrayList<Books> books = new ArrayList<Books>() ;
        Books book = mock(Books.class);
        books.add(book);
        BusinessLogic bl = new BusinessLogic();
        when(book.getBookId()).thenReturn(bookId);
        //Positive Testing
        System.setIn(new ByteArrayInputStream(bookId.getBytes()));
        assertEquals(bl.reserveBook(books), true);

        //Negative Testing
        System.setIn(new ByteArrayInputStream(name.getBytes()));
        assertEquals(bl.reserveBook(books), false);

    }
}
