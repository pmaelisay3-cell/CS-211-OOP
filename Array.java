public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        System.out.println("Array Elements:");
        for (int num : numbers) {
            sum += num;
            System.out.println(num);
        }

        double average = (double) sum / numbers.length;
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }
}
