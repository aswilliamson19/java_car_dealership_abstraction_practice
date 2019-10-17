import org.junit.Before;
import org.junit.Test;
import people.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Mike", 2000, 3000);
    }

    @Test
    public void hasName() {
        assertEquals("Mike", customer.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(2000, customer.getBudget(), 0.01);
    }


}
