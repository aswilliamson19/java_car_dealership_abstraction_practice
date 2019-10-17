package Vehicle;

public abstract class Vehicle {

    private String make;
    private String model;
    private String year;
    private int price;

    public Vehicle(String make, String model, String year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

}
