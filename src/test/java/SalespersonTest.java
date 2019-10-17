import Vehicle.Car;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Salesperson;

import static org.junit.Assert.assertEquals;

public class SalespersonTest {

    Salesperson salesperson;
    Salesperson salesperson1;

    Car car;
    Car car2;
    Customer customer;
    Dealership dealership;

    @Before
    public void before() {
        salesperson = new Salesperson("Susan", 200, 10);
        salesperson1 = new Salesperson("Allan", 1500, 4);

        car = new Car("Toyota", "Yaris", "1998", 2000);
        car2 = new Car("Toyota", "Aygo", "1998", 2000);

        customer = new Customer("Mike", 2000, 3000);

        dealership = new Dealership("Cars and Stuff", 10000);
        dealership.addVehicle(car);
        dealership.addVehicle(car2);
    }

    @Test
    public void hasName() {
        assertEquals("Susan", salesperson.getName());
    }

    @Test
    public void hasCommission(){
        assertEquals(200, salesperson.getCommission(), 0.01);
    }

    @Test
    public void employeeOfTheMonth(){
        assertEquals(false, salesperson.isEmployeeOfTheMonth());
    }

    @Test
    public void hasTrophies(){
        assertEquals(10, salesperson.getTrophies());
    }

    @Test
    public void canSell() {
        salesperson.sell(car, dealership);
        assertEquals(1, dealership.countVehicles());
        assertEquals(12000, dealership.getBalance(), 0.01);
        assertEquals(400, salesperson.getCommission(), 0.01);
    }

    @Test
    public void canGetATrophy() {
        salesperson1.awardTrophy();
        assertEquals(5, salesperson1.getTrophies());
        assertEquals(500, salesperson1.getCommission(), 0.01);
    }


}
