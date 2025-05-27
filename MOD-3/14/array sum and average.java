import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Validate number of elements
        if (n <= 0) {
            System.out.println("Number of elements must be greater than zero.");
        } else {
            int[] numbers = new int[n];

            // Read elements into the array
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Calculate sum
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            // Calculate average
            double average = (double) sum / n;

            // Display results
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }

        scanner.close();
    }
}
