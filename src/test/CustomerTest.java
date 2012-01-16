package test;

import main.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
* Created by IntelliJ IDEA.
* User: Osaide Ogbeifun
* Date: 1/15/12
* Time: 1:58 PM
* To change this template use File | Settings | File Templates.
*/
@RunWith(Parameterized.class)
public class CustomerTest {



        private String name = "";
        private String id = "";

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            Object[][] data = Parameter.MOCK_CUSTOMER;
            return Arrays.asList(data);
        }

        public CustomerTest(String id, String name) {
            this.name = name;
            this.id = id;

        }

     Customer sampleCustomer = new Customer();


    @Test
    public void testGetName() throws Exception {
        sampleCustomer.setName(name);
        assertEquals(sampleCustomer.getName(), name);
    }

    @Test
    public void testGetCustomerID() throws Exception {
        sampleCustomer.setCustomerID(id);
        assertEquals(sampleCustomer.getCustomerID(), id);

    }

}
