package main;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 4:40 AM
 */

public class Printer {
	public static void printProduct(ArrayList<main.product.ProductIntf> product) {
		System.out.println("\n");
		System.out.println("**************************");
		System.out.println("Available titles");
		System.out.println("**************************");
		for (main.product.ProductIntf prd : product) {
			System.out.println(prd.getId() + ": " + prd.getName());
		}

	}

	public static void printMenu(ArrayList<MenuItem> Menu) {
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

	public static void printCustomer(Customer sampleCustomer) {
		System.out.println("\n");
		//System.out.println(sampleCustomer.getCustomerID());  //Not implemented as per requirement
		System.out.println("%>: Please talk to Librarian. Thank you.");

	}
}
