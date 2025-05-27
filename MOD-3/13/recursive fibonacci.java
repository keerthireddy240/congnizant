import java.util.Scanner;

public class RecursiveFibonacci {
    
    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0; // By definition, Fibonacci(1) = 0
        } else if (n == 2) {
            return 1; // Fibonacci(2) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for positive integer n
        System.out.print("Enter a positive integer n to find the nth Fibonacci number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int result = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }

        scanner.close();
    }
}
