package test;

/**
 * Created by IntelliJ IDEA.
 * User: Osaide Ogbeifun
 * Date: 1/15/12
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Parameter {

    public static Object[][] MOCK_BOOKS;

    static {
        MOCK_BOOKS = new Object[][]{
                {"1", "Test Book Name"},
                {"2", "Test Book Name 2"},
                {"3", "Test Book Name 3"}
        };
    }

    public static Object[][] MOCK_CUSTOMER;

    static {
        MOCK_CUSTOMER = new Object[][]{
                {"111-1111", "Customer Name"},
                {"111-1112", "Customer Name 2"},
                {"111-1113", "Customer Name 3"}
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
