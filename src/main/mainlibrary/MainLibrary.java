package main.mainlibrary;

import main.Customer.CustomerIntf;
import main.product.Books;
import main.product.ProductIntf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date 1/15/12
 *         Time: 5:14 AM
 */
public class MainLibrary {
	public static void main(String[] args) {
		ArrayList<ProductIntf> BookList = new ArrayList<ProductIntf>();
		ArrayList<ProductIntf> MovieList = new ArrayList<ProductIntf>();
		ArrayList<MenuItem> Menu = new ArrayList<MenuItem>();
		//Borrowed this rather fast idea from TWU code smell file.
		HashMap<String, CustomerIntf> users = new HashMap<String, CustomerIntf>();
		boolean exit = true;

		/**This is just an easy way to add bunch of data copied from the code smell example;
		 * as entering data for each instantiation would be rather tedious.
		 *
		 */
		String[] movieName = {"Idiocracy",
				"Il Cappotto (a.k.a. Overcoat)",
				"In Their Own Words: The Tuskegee Airmen",
				"Indomitable Teddy Roosevelt (Smithsonian)",
				"Jake & The Never Land Pirates: Peter Pan Returns",
				"James Cagney Collection (4-Disc): Blood On Sun / Something To Sing About / Great Guy / Time Of Your Life",
				"Japanese Superhero: Starman (3-Disc)",
				"Jared Meeker's Serious Shred: Essential Concepts (Book w/ DVD)",
				"Jerome Rose: Jerome Rose Plays Brahms: Live In Concert (Blu-ray)",
				"Jersey Shore (Paramount): Season 1: Uncensored",
				"Jersey Shore (Paramount): Season 2",
				"Jersey Shore (Paramount): Season 3",
				"Jimmy Martin: King Of Bluegrass: The Life And Times Of Jimmy Martin",
				"John Adams",
				"John Adams (Blu-ray)"};
		String[] directorName = {"Fox",
				"Raro Video USA",
				"Bryton Entertainment",
				"Smithsonian",
				"Buena Vista",
				"Alpha Video",
				"Alpha Video",
				"Alfred Publishing",
				"Medici Classics",
				"Paramount",
				"Paramount",
				"Paramount",
				"Thrill Jockey",
				"HBO",
				"HBO"};
		String[] rating = {"1", "10", "N/A", "N/A", "1", "4", "6", "10", "9", "2", "3", "N/A", "2", "2", "5"};

		ProductIntf book1 = new Books("1", "Extreme Programming");
		ProductIntf book2 = new Books("2", "HitchHikers Guide to the Galaxy");
		ProductIntf book3 = new Books("3", "Deception Point");

		/**
		 * Dynamic Instantiation of Movies Class. This is just to make my life easier
		 */
		for (int i = 0; i < movieName.length; i++) {
			MovieList.add(new main.product.Movies(Integer.toString(i + 1), movieName[i], directorName[i], rating[i]));
		}

		BookList.add(book1);
		BookList.add(book2);
		BookList.add(book3);

		CustomerIntf sampleCustomer = new main.Customer.Customer("Sample Customer");
		CustomerIntf sampleCustomer2 = new main.Customer.Customer("Sample Customer", "test-1234");

		users.put(sampleCustomer.getCustomerID(), sampleCustomer);
		users.put(sampleCustomer2.getCustomerID(), sampleCustomer2);

		MenuItem item1 = new MenuItem(1, "List Book Catalog");
		MenuItem item2 = new MenuItem(2, "Reserve a Book");
		MenuItem item3 = new MenuItem(3, "What is my Library Number?");
		MenuItem item4 = new MenuItem(4, "Reserve a Movie");
		MenuItem item5 = new MenuItem(5, "User Login");
		MenuItem item6 = new MenuItem(6, "Exit");


		Menu.add(item1);
		Menu.add(item2);
		Menu.add(item3);
		Menu.add(item4);
		Menu.add(item5);
		Menu.add(item6);

		CustomerIntf dummy = sampleCustomer;
		while (exit) {
			Printer.printMenu(Menu);
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
					printBooks(BookList);
					break;
				case 2:
					reserveProduct(BookList, "Book");
					break;
				case 3:
					getLibNumber(dummy);
					break;
				case 4:
					reserveProduct(MovieList, "Movie");
					break;
				case 5:
					dummy = authenticateUser(users);
					break;
				case 6:
					exit = false;
					break;
				default:
					System.out.println("Menu Item Not Found, Please try again");
					break;

			}
		}

	}


	public static void printBooks(ArrayList<ProductIntf> product) {
		Printer.printProduct(product);

	}

	public static boolean reserveProduct(ArrayList<ProductIntf> product, String type) {

		Printer.printProduct(product);
		System.out.print("Input number to select from Available " + type + " titles #:");
		int id = 0;
		try {
			id = Integer.parseInt(keyInput());
		} catch (Exception e) {

			System.out.println("Please input a valid Integer %>:");

		}

		for (ProductIntf prd : product) {
			if (Integer.parseInt(prd.getId()) == id) {
				System.out.println("%>: Thank You! Enjoy the " + type + " " + prd.getName());
				return true;
			}

		}
		System.out.println("Sorry we don't have that " + type + " yet");
		return false;


	}


	public static void getLibNumber(CustomerIntf customer) {
		Printer.printCustomer(customer);
	}

	public static CustomerIntf authenticateUser(HashMap<String, CustomerIntf> users) {
		String LibraryAssistant = "111-1111";


		System.out.println("Please Enter your user ID :");
		String id = keyInput();

		System.out.println("Please Enter your user Password :");
		String password = keyInput();

		if (users.containsKey(id)) {
			if (password.equals(users.get(id).getPassword())) {
				System.out.println("User is Authenticated");
				users.get(id).customerIsLoggedIn(true);
				return users.get(id);
			} else
				System.out.println("Wrong UserName or Password.. ");
			return users.get(LibraryAssistant);
		} else
			System.out.println("Wrong UserName or Password...");
		return users.get(LibraryAssistant);


	}

	public static String keyInput() {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputStream);
		String data = "";
		try {
			data = reader.readLine();
		} catch (Exception e) {

			System.out.println("An error has occurred:");

		}
		return data;

	}
}
