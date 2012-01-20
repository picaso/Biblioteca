package main.Customer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/19/12
 *         time: 11:42 PM
 */

public interface CustomerIntf {
	public String getName();

	public String getCustomerID();

	public String getPassword();

	public boolean isLoggedIn();

	public void customerIsLoggedIn(boolean loggedIn);
}
