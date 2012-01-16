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
 * User: Osaide Ogbeifun
 * Date: 1/15/12
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
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
