package test;

import main.Customer.Customer;
import main.Customer.CustomerIntf;
import main.mainlibrary.MainLibrary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/15/12
 *         time: 2:07 PM
 */

@RunWith(Parameterized.class)
public class CustomerTest {


	private String name = "";
	private String id = "";
	private String password = "";


	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = Parameter.MOCK_CUSTOMER;
		return Arrays.asList(data);
	}

	public CustomerTest(String id, String name, String password) {
		this.name = name;
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
		CustomerIntf dummy;
		users.put(id, customer);
		when(users.get(id).getPassword()).thenReturn(password);
		when(users.get(id).getCustomerID()).thenReturn(id);


		when(customer.getPassword()).thenReturn(password);
		when(customer.getCustomerID()).thenReturn(id);

		System.setIn(new ByteArrayInputStream(id.getBytes()));
		//Scanner scanner = new Scanner(System.in);
		//System.out.println(scanner.nextLine());
		System.setIn(new ByteArrayInputStream(password.getBytes()));


		dummy = MainLibrary.authenticateUser(users);
		System.out.println(users.get(id).getCustomerID());

		assertEquals(dummy, customer);
	}


}
