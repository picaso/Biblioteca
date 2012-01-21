package test;

import main.Customer.Customer;
import main.Customer.CustomerIntf;
import main.mainlibrary.MainLibrary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 2:07 PM
 */

@RunWith(Parameterized.class)
public class CustomerTest {


	private String id = "";
	private String password = "";


	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = Parameter.MOCK_CUSTOMER;
		return Arrays.asList(data);
	}

	public CustomerTest(String id, String password) {

		this.id = id;
		this.password = password;

	}

	/**
	 * Not the Ideal location to test this method, should be in MainLibraryTest. I put it here
	 * because I need the parameters of Mock_Custom at runTime which can't be implemented @
	 * MainLibraryTest.class
	 *
	 * @throws Exception Error
	 */

	@Test
	public void testCustomerLogin() throws Exception {
		HashMap<String, CustomerIntf> users = new HashMap<String, CustomerIntf>();
		CustomerIntf customer = mock(Customer.class);
		int i = 0;
		users.put(id, customer);

		InputStream iPassword = new ByteArrayInputStream(password.getBytes());

		System.setIn(iPassword);

		/** Normally the authenticateUser method takes in a user ID and Password.
		 * but since i can't figure out how to account for two System.setIn inputs simultaneously,
		 * I did a pass, fail, fail approach by passing password as both id and password and should return
		 * object, null, null
		 */

		assertEquals(MainLibrary.authenticateUser(users), users.get("111-1111"));
		i = i + 1;
		assertEquals(users.size(), i);

	}


}
