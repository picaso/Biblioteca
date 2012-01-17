package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Osaide Ogbeifn
 * Date: 1/15/12
 * Time: 5:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainLibrary {
    public static void main(String[] args) {
        ArrayList<Books> BookList = new ArrayList<Books>();
        ArrayList<MenuItem> Menu = new ArrayList<MenuItem>();
        BusinessLogic bl = new BusinessLogic();

        Books book1 = new Books("1", "Extreme Programming");
        Books book2 = new Books("2", "HitchHikers Guide to the Galaxy");
        Books book3 = new Books("3", "Deception Point");

        BookList.add(book1);
        BookList.add(book2);
        BookList.add(book3);

        Customer sampleCustomer = new Customer();
	    sampleCustomer.setCustomerID("111-1111");
	    sampleCustomer.setName("Sample Customer");

        Printer print = new Printer();

        MenuItem item1 = new MenuItem(1, "List Book Catalog");
        MenuItem item2 = new MenuItem(2, "Reserve a Book");
        MenuItem item3 = new MenuItem(3, "What is my Library Number?");

        Menu.add(item1);
        Menu.add(item2);
        Menu.add(item3);

        while (true) {
            print.printMenu(Menu);
            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStream);

            int menuItem = 0;
            try {
                menuItem = Integer.parseInt(reader.readLine());
            } catch (Exception e) {

                System.out.println("Menu Item Not Found, Please try again");

            }

            switch (menuItem) {
                case 1:
                    bl.printBooks(BookList);
                    break;
                case 2:
                    bl.reserveBook(BookList);
                    break;
                case 3:
                    bl.getLibNumber(sampleCustomer);
                    break;
                default:
                    System.out.println("Menu Item Not Found, Please try again");
                    break;

            }
        }

    }

}
