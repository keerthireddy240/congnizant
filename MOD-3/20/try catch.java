import java.util.Scanner;

public class DivisionTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for two integers
            System.out.print("Enter the numerator (integer): ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator (integer): ");
            int denominator = scanner.nextInt();

            // Attempt to divide numerator by denominator
            int result = numerator / denominator;

            // Display the result
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle other exceptions like invalid input
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
