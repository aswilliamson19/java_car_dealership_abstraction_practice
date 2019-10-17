package behaviours;

import Vehicle.Vehicle;
import dealership.Dealership;
import people.Customer;

public interface ISell {

    String sell(Vehicle vehicle, Dealership dealership, Customer customer);
}
