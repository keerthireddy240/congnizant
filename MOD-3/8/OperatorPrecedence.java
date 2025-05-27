public class OperatorPrecedence {
    public static void main(String[] args) {
        // Example 1: Without parentheses
        int result1 = 10 + 5 * 2;
        // According to precedence: 5 * 2 = 10, then 10 + 10 = 20

        // Example 2: With parentheses changing precedence
        int result2 = (10 + 5) * 2;
        // Parentheses first: 10 + 5 = 15, then 15 * 2 = 30

        // Example 3: More complex expression
        int result3 = 100 / 5 + 6 * 2 - 10;
        // Division and multiplication first: (100 / 5 = 20), (6 * 2 = 12)
        // Then left to right: 20 + 12 = 32, 32 - 10 = 22

        // Display the results
        System.out.println("Result of 10 + 5 * 2 = " + result1);
        System.out.println("Result of (10 + 5) * 2 = " + result2);
        System.out.println("Result of 100 / 5 + 6 * 2 - 10 = " + result3);
    }
}
