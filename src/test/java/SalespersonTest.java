import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;
import people.Salesperson;

import static org.junit.Assert.assertEquals;

public class SalespersonTest {

    Salesperson salesperson;
    Car car;

    @Before
    public void before() {
        salesperson = new Salesperson("Susan", 200, false, 1);
        car = new Car("Toyota", "Yaris", "1998", 2000);
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
    public void hastrophies(){
        assertEquals(1, salesperson.getTrophies());
    }

    @Test
    public void canSell() {
        salesperson.sell(car);
        assertEquals(1, salesperson.countVehiclesSold());
        assertEquals(false, car.isAvailable());
    }




}
