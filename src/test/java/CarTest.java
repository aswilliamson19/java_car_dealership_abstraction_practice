import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car("Toyota", "Yaris", "1998", 2000);
    }

    @Test
    public void hasMake() {
        assertEquals("Toyota", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Yaris", car.getModel());
    }

    @Test
    public void hasYear() {
        assertEquals("1998", car.getYear());
    }

    @Test
    public void hasPrice() {
        assertEquals(2000, car.getPrice());
    }


}
