package people;

import Vehicle.Vehicle;
import behaviours.ISell;
import dealership.Dealership;

public class Salesperson extends Person implements ISell {

    private double commission;
    private boolean employeeOfTheMonth;
    private int trophies;

    public Salesperson(String name, double commission, int trophies) {
        super(name);
        this.commission = commission;
        this.employeeOfTheMonth = false;
        this.trophies = trophies;
    }

    public String sell(Vehicle vehicle, Dealership dealership) {
        dealership.removeVehicle(vehicle);
        dealership.addToBalance(vehicle);
        saleCommission(vehicle);
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

    public double saleCommission(Vehicle vehicle){
        return this.commission += (vehicle.getPrice() * 0.1);
    }

    public void awardTrophy() {
        if (this.commission >= 1000){
            this.trophies += 1;
            this.commission -= 1000;
        }
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
