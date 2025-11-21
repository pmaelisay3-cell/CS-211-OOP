import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Circle Calculator ===");
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        final double PI = Math.PI; 
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        double diameter = 2 * radius;

        System.out.printf("Diameter: %.2f units\n", diameter);
        System.out.printf("Circumference: %.2f units\n", circumference);
        System.out.printf("Area: %.2f square units\n", area);

        scanner.close();
        System.out.println("Calculation complete!");
    }
}
