import Vehicle.Car;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Salesperson;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Salesperson salesperson1;
    Salesperson salesperson2;
    Salesperson salesperson3;


    @Before
    public void before() {
        dealership = new Dealership("Cars and Stuff", 10000);
        car = new Car("Toyota", "Yaris", "1998", 2000);
        dealership.addVehicle(car);
        salesperson1 = new Salesperson("Allan", 500, false, 4);
        salesperson2 = new Salesperson("Susan", 200, false, 1);
        salesperson3 = new Salesperson("Adam", 1000, true, 9);
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
}
