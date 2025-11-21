abstract class Car {
    String brand = "Toyota";
    String color;
    int year;
    double price;

    abstract void startEngine();
    abstract void stopEngine();

    Car(String color, int year, double price) {
        this.color = color;
        this.year = year;
        this.price = price;
    }

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }

    void showDetails() {
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price:Php" + price);
    }
}

class ToyotaVios extends Car {

    ToyotaVios(String color, int year, double price) {
        super(color, year, price);  
    }

    @Override
    void startEngine() {
        System.out.println("Toyota Vios engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Toyota Vios engine stopped.");
    }

    void showModel() {
        System.out.println("Model: Vios");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new ToyotaVios("Silver Metallic 1", 2020, 738000.0);   

        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();
        ((ToyotaVios) myCar).showModel();       
        myCar.showDetails();  

    }
}
