package main.Customer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 4:11 AM
 */

public class Customer implements CustomerIntf {

	private String name = "";
	private String customerID = "";
	private String password = "";
	private boolean loggedIn = false;
	//Singleton Implementation of generating ID, so it's constant throughout runtime
	IdGenerator id = IdGenerator.getInstance();

	public Customer(String name, String password) {
		this.name = name;
		this.customerID = id.getNextId();
		this.password = password;
	}

	public Customer(String name) {
		this.name = name;
		this.customerID = id.getNextId();
		this.password = "WelCome01-"; //Default Password

	}

	public String getName() {
		return name;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getPassword() {
		return password;
	}

	public void customerIsLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}
}
