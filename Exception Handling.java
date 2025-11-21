public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[1] / 0; 
            System.out.println("Result: " + result);
            
            System.out.println(numbers[5]); 
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
