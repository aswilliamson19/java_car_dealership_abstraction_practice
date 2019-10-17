import Vehicle.Van;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VanTest {

    Van van;

    @Before
    public void before() {
        van = new Van("Ford", "E33", "2002", 2000);
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", van.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("E33", van.getModel());
    }

    @Test
    public void hasYear() {
        assertEquals("2002", van.getYear());
    }

    @Test
    public void hasPrice() {
        assertEquals(2000, van.getPrice());
    }

}
