package test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 2:07 PM
 */

public class Parameter {

	public static Object[][] MOCK_PRODUCTS;

	static {
		MOCK_PRODUCTS = new Object[][]{
				{"1", "Test Book Name", "Director's Name", "Rating"},
				{"2", "Test Book Name 2", "Director's Name 2", "Rating 2"},
				{"3", "Test Book Name 3", "Director's Name 3", "Rating 3"},
		};
	}

	public static Object[][] MOCK_CUSTOMER;

	static {
		MOCK_CUSTOMER = new Object[][]{
				{"111-1111", "Customer Name", "Password"},
				{"111-1112", "Customer Name 2", "Password2"},
				{"111-1113", "Customer Name 3", "Password3"}
		};
	}

	public static Object[][] MOCK_MENUITEM;

	static {
		MOCK_MENUITEM = new Object[][]{
				{1, "Test ITEM Name"},
				{2, "Test ITEM Name 2"},
				{3, "Test ITEM Name 3"}
		};
	}

	public static Object[][] MOCK_PRINTER;

	static {
		MOCK_PRINTER = new Object[][]{
				{1, "1", "Test ITEM Name"},
				{2, "1", "Test ITEM Name 2"},
				{3, "1", "Test ITEM Name 3"}
		};
	}

}
