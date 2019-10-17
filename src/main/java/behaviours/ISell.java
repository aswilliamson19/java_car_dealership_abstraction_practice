package behaviours;

import Vehicle.Vehicle;
import dealership.Dealership;

public interface ISell {

    String sell(Vehicle vehicle, Dealership dealership);
}
