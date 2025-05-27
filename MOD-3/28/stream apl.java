import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenFilter {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // Use Stream API to filter even numbers and collect the result
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Display the even numbers
        System.out.println("Even numbers: " + evenNumbers);
    }
}
