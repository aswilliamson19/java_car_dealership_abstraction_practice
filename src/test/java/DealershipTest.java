import Vehicle.Car;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Salesperson;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Salesperson salesperson1;
    Salesperson salesperson2;
    Salesperson salesperson3;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    @Before
    public void before() {
        dealership = new Dealership("Cars and Stuff", 10000);
        car = new Car("Toyota", "Yaris", "1998", 2000);
        dealership.addVehicle(car);
        salesperson1 = new Salesperson("Allan", 500, 4);
        salesperson2 = new Salesperson("Susan", 200, 1);
        salesperson3 = new Salesperson("Adam", 1000,9);
        dealership.addStaff(salesperson1);
        dealership.addStaff(salesperson2);
        dealership.addStaff(salesperson3);
        customer1 = new Customer("Mike", 2000, 3000);
        customer2 = new Customer("Amanda", 2000, 3000);
        customer3 = new Customer("Laura", 2000, 3000);
    }

    @Test
    public void getName() {
        assertEquals("Cars and Stuff", dealership.getName());
    }

    @Test
    public void canCountVehicles() {
        assertEquals(1, dealership.countVehicles());
    }

    @Test
    public void hasBalance() {
        assertEquals(10000, dealership.getBalance(), 0.01);
    }

    @Test
    public void hasASalesTeam() {
        assertEquals(3, dealership.countSalesTeam());
    }

    @Test
    public void canHaveABiddingWar() {
        dealership.haggle(salesperson1, customer1);
        assertEquals(500, salesperson1.getCommission(), 0.01);
    }
}
