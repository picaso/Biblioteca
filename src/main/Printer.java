package main;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Osaide Ogbeifun
 * Date: 1/15/12
 * Time: 4:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class Printer {
    public void printBooks(ArrayList<Books> Books) {
        System.out.println("\n");
        System.out.println("**************************");
        System.out.println("Available Book titles");
        System.out.println("**************************");
        for (Books Book : Books) {
            System.out.println(Book.getBookId() + ": " + Book.getName());
        }

    }

    public void printMenu(ArrayList<MenuItem> Menu) {
        System.out.println("\n");
        System.out.println("The Bangalore Public Library System : BIBLIOTECA");
        System.out.println("\n");
        System.out.println("*************************************");
        System.out.println("Select a Menu Option Via Item Number");
        System.out.println("*************************************");
        for (MenuItem item : Menu) {
            System.out.println(item.getQuestionID() + ": " + item.getQuestion());
        }
        System.out.print("Menu Item # %>: ");
    }

    public void printCustomer(Customer sampleCustomer) {
        System.out.println("\n");
        //System.out.println(sampleCustomer.getCustomerID());  //Not implemented as per requirement
        System.out.println("%>: Please talk to Librarian. Thank you.");

    }
}
