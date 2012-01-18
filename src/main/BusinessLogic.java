package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 6:46 AM
 */

public class BusinessLogic {
	Printer print = new Printer();

	public void printBooks(ArrayList<Books> Books) {
		print.printBooks(Books);

	}

	public boolean reserveBook(ArrayList<Books> Books) {

		print.printBooks(Books);
		System.out.print("Input number to select from Available Book titles #:");
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputStream);
		int id = 0;
		try {
			id = Integer.parseInt(reader.readLine());
		} catch (Exception e) {

			System.out.println("Please input a valid Integer %>:");

		}

		for (Books book : Books) {
			if (Integer.parseInt(book.getBookId()) == id) {
				System.out.println("%>: Thank You! Enjoy the book " + book.getName());
				return true;
			}

		}
		System.out.println("Sorry we don't have that book yet");
		return false;


	}


	public void getLibNumber(Customer sampleCustomer) {
		print.printCustomer(sampleCustomer);
	}
}
