package people;

import Vehicle.Vehicle;
import behaviours.ISell;
import dealership.Dealership;

public class Salesperson extends Person implements ISell {

    private double commission;
    private boolean employeeOfTheMonth;
    private int trophies;

    public Salesperson(String name, double commission, boolean employeeOfTheMonth, int trophies) {
        super(name);
        this.commission = commission;
        this.employeeOfTheMonth = employeeOfTheMonth;
        this.trophies = trophies;
    }

    public String sell(Vehicle vehicle, Dealership dealership, Customer customer) {
        dealership.removeVehicle(vehicle);
        dealership.addToBalance(vehicle);
        customer.gainVehicle(vehicle);
        customer.payForVehicle(vehicle);
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
}
