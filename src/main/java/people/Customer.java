package people;

import Vehicle.Vehicle;
import java.util.ArrayList;

public class Customer extends Person {

    private double budget;
    private double wallet;
    private ArrayList<Vehicle> boughtVehicles;

    public Customer(String name, double budget, double wallet) {
        super(name);
        this.budget = budget;
        this.wallet = wallet;
        this.boughtVehicles = new ArrayList<Vehicle>();
    }

    public double getBudget() {
        return budget;
    }

    public double getWallet() {
        return wallet;
    }

    public int getBoughtVehicles() {
        return boughtVehicles.size();
    }

    public void gainVehicle(Vehicle vehicle){
        this.boughtVehicles.add(vehicle);
    }

    public void payForVehicle(Vehicle vehicle) {
        this.wallet -= vehicle.getPrice();
    }

}
