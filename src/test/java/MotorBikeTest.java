import Vehicle.MotorBike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorBikeTest {

    MotorBike motorbike;

    @Before
    public void before() {
        motorbike = new MotorBike("Harley", "V55", "1969", 9000);
    }

    @Test
    public void hasMake() {
        assertEquals("Harley", motorbike.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("V55", motorbike.getModel());
    }

    @Test
    public void hasYear() {
        assertEquals("1969", motorbike.getYear());
    }

    @Test
    public void hasPrice() {
        assertEquals(9000, motorbike.getPrice());
    }



}
