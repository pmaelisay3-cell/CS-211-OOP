class Vehicle {
    String brand;
    int year;
    String ownerName;

    Vehicle(String brand, int year, String ownerName) {
        this.brand = brand;
        this.year = year;
        this.ownerName = ownerName;
    }

    void info() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Owner: " + ownerName);
    }

    void speed() {
        System.out.println("Vehicle has an average speed.");
    }
}

class Car extends Vehicle {
    String model;
    int doors;
    double fuelCapacity;

    Car(String brand, String model, int year, int doors, String ownerName, double fuelCapacity) {
        super(brand, year, ownerName);
        this.model = model;
        this.doors = doors;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    void info() {
        super.info(); // Call parent info
        System.out.println("Model: " + model);
        System.out.println("Doors: " + doors);
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

    @Override
    void speed() {
        System.out.println("Car runs at 150 km/h.");
    }
}

class Motorcycle extends Vehicle {
    String model;
    double fuelCapacity;

    Motorcycle(String brand, String model, int year, String ownerName, double fuelCapacity) {
        super(brand, year, ownerName);
        this.model = model;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Model: " + model);
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

    @Override
    void speed() {
        System.out.println("Motorcycle runs at 120 km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota", "Vios", 2024, 4, "Princess Mae", 45.0);
        Vehicle v2 = new Motorcycle("Honda", "CBR500R", 2020, "Pauline Vizco", 15.0);

        System.out.println("=== Car Info ===");
        v1.info();
        v1.speed();

        System.out.println("\n=== Motorcycle Info ===");
        v2.info();
        v2.speed();
    }
}
