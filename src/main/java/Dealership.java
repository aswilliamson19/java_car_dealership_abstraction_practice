import Vehicle.Vehicle;
import people.Salesperson;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> availableVehicles;
    private ArrayList<Salesperson> salesTeam;
    private double balance;
    private String name;

    public Dealership(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.availableVehicles = new ArrayList<Vehicle>();
        this.salesTeam = new ArrayList<Salesperson>();
    }

    public String getName() {
        return this.name;
    }

    public void addVehicle(Vehicle vehicle) {
        this.availableVehicles.add(vehicle);
    }

    public int countVehicles() {
        return this.availableVehicles.size();
    }

    public double getBalance() {
        return this.balance;
    }

    public ArrayList<Salesperson> getSalesTeam() {
        return this.salesTeam;
    }

    public int countSalesTeam(){
        return this.salesTeam.size();
    }
}
