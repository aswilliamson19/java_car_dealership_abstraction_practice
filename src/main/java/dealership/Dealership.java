package dealership;

import Vehicle.Vehicle;
import people.Customer;
import people.Salesperson;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> availableVehicles;
    private ArrayList<Salesperson> salesTeam;
    private ArrayList<Customer> customers;
    private double balance;
    private String name;

    public Dealership(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.availableVehicles = new ArrayList<Vehicle>();
        this.salesTeam = new ArrayList<Salesperson>();
        this.customers = new ArrayList<Customer>();
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

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public int countSalesTeam(){
        return this.salesTeam.size();
    }

    public void removeVehicle(Vehicle vehicle){
        this.availableVehicles.remove(vehicle);
    }

    public void addToBalance(Vehicle vehicle) {
        this.balance += vehicle.getPrice();
    }

    public void addStaff(Salesperson salesperson) {
        this.salesTeam.add(salesperson);
    }

    public void haggle(Salesperson salesperson, Customer customer) {
        double number = 0;
        if (salesperson.getStrength() > customer.getStrength()){
           number = 200 + salesperson.getCommission();
        } else {
            number = salesperson.getCommission() - 200;
        }
        salesperson.setCommission(number);
    }
}
