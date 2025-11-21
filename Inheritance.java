class Vehicle {
    String brand;
    String color;
    int year;


    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;
    double price;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price:Php" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Vios";
        myCar.color = "Silver Metallic 1";
        myCar.year = 2020;
        myCar.price = 738000;

        myCar.start();
        myCar.displayInfo();
    }
}
