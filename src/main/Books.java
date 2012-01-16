package main;

/**
 * Created by IntelliJ IDEA.
 * User: Osaide Ogbeifun
 * Date: 1/15/12
 * Time: 3:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Books {

    private String name = "";
    private String bookId = "";

    public Books(String bookId, String name) {
        this.name = name;
        this.bookId =bookId;
    }

    public String getName() {
        return name;
    }

    public String getBookId() {
        return bookId;
    }

}
