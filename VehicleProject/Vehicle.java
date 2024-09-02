package VehicleProject;

public class Vehicle {
    private int topSpeed;
    private int current_speed;
    private String colour;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;

    public Vehicle(String colour, String model, String manufacturer, String plateNumber) {
        this.topSpeed = 0;
        this.current_speed = 0;
        this.colour = colour;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = true;
    }

    public boolean accelerate() {
        System.out.println("The ");
        return true;
    }

    public boolean decelerate() {
        return true;
    }

    public void display() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return String.format("Vehicle: %s, %s, %s, %s, %s, %s", this.colour, this.model, this.manufacturer, this.plateNumber, this.topSpeed, this.current_speed);
    }
}
