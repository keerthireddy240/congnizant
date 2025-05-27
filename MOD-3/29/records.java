import java.util.List;
import java.util.stream.Collectors;

// Define the Person record
record Person(String name, int age) {}

public class RecordDemo {
    public static void main(String[] args) {
        // Create instances of Person
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Charlie", 30);

        // Print the individual records
        System.out.println("All Persons:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Add them to a List
        List<Person> people = List.of(p1, p2, p3);

        // Use Stream to filter people aged 18 and above
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        // Display the filtered list
        System.out.println("\nAdults (age >= 18):");
        adults.forEach(System.out::println);
    }
}
