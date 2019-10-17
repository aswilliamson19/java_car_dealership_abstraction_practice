package people;

import Vehicle.Vehicle;
import behaviours.ISell;

import java.util.ArrayList;

public class Salesperson extends Person implements ISell {

    private ArrayList<Vehicle> vehiclesSold;
    private double commission;
    private boolean employeeOfTheMonth;
    private int trophies;

    public Salesperson(String name, double commission, boolean employeeOfTheMonth, int trophies) {
        super(name);
        this.vehiclesSold = new ArrayList<Vehicle>();
        this.commission = commission;
        this.employeeOfTheMonth = employeeOfTheMonth;
        this.trophies = trophies;
    }

    public int countVehiclesSold() {
        return this.vehiclesSold.size();
    }

    public String sell(Vehicle vehicle) {
        this.vehiclesSold.add(vehicle);
        vehicle.sold();
        return "I have sold a: " + vehicle.getMake();
    }

    public double getCommission() {
        return this.commission;
    }

    public boolean isEmployeeOfTheMonth() {
        return this.employeeOfTheMonth;
    }

    public int getTrophies() {
        return this.trophies;
    }
}
