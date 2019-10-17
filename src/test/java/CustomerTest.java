import Vehicle.Car;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Salesperson;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Salesperson salesperson;
    Dealership dealership;

    @Before
    public void before() {
        customer = new Customer("Mike", 2000, 3000);
        car = new Car("Toyota", "Yaris", "1998", 2000);
        salesperson = new Salesperson("Susan", 200, 10);
        dealership = new Dealership("Cars and Stuff", 10000);

    }

    @Test
    public void hasName() {
        assertEquals("Mike", customer.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(2000, customer.getBudget(), 0.01);
    }

    @Test
    public void canBuy() {
        customer.buy(car, salesperson, dealership);
        assertEquals(1000, customer.getWallet(), 0.01);
        assertEquals(1, customer.getBoughtVehicles());
    }

}
