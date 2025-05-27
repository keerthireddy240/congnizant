public class MethodOverloadingDemo {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Calling add methods with different parameters
        int sumTwoInts = add(5, 10);
        double sumTwoDoubles = add(3.5, 4.7);
        int sumThreeInts = add(1, 2, 3);

        // Display the results
        System.out.println("Sum of two integers (5 + 10): " + sumTwoInts);
        System.out.println("Sum of two doubles (3.5 + 4.7): " + sumTwoDoubles);
        System.out.println("Sum of three integers (1 + 2 + 3): " + sumThreeInts);
    }
}
