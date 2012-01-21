package test;


import main.mainlibrary.MainLibrary;
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
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 3:43 PM
 */

@RunWith(Parameterized.class)
public class MainLibraryTest {

	private String name = "";
	private String id = "";
	private String dirName;
	private String rating;

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = test.Parameter.MOCK_PRODUCTS;
		return Arrays.asList(data);
	}

	public MainLibraryTest(String id, String name, String dirName, String rating) {
		this.name = name;
		this.id = id;
		this.dirName = dirName;
		this.rating = rating;

	}

	@Test
	public void testReserveBook() throws Exception {
		ArrayList<main.product.ProductIntf> books = new ArrayList<main.product.ProductIntf>();
		main.product.ProductIntf book = mock(main.product.Books.class);
		books.add(book);

		when(book.getId()).thenReturn(id);
		//Positive Testing
		System.setIn(new ByteArrayInputStream(id.getBytes()));
		assertEquals(MainLibrary.reserveProduct(books, "book"), true);


		//Negative Testing
		System.setIn(new ByteArrayInputStream(name.getBytes()));
		assertEquals(MainLibrary.reserveProduct(books, "books"), false);

	}

	@Test
	public void testReserveMovie() throws Exception {
		ArrayList<main.product.ProductIntf> movies = new ArrayList<main.product.ProductIntf>();
		main.product.ProductIntf movie = mock(main.product.Movies.class);
		movies.add(movie);


		when(movie.getId()).thenReturn(id);

		//Positive Testing
		System.setIn(new ByteArrayInputStream(id.getBytes()));
		assertEquals(MainLibrary.reserveProduct(movies, "movie"), true);


		//Negative Testing
		System.setIn(new ByteArrayInputStream(name.getBytes()));
		assertEquals(MainLibrary.reserveProduct(movies, "movie"), false);

	}

	@Test
	public void testMovieGetterWithUniqueReturn() {
		main.product.ProductIntf movie = new main.product.Movies(id, name, dirName, rating);
		assertEquals(movie.getName(), name + " By: " + dirName + " Rating[0-10]: " + rating);
	}
}
