import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.println("Enter student names. Type 'done' to finish:");

        // Input loop to add names to the list
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            // Check for termination input
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            // Add name to the ArrayList
            studentNames.add(name);
        }

        // Display all names entered
        System.out.println("\nStudent Names:");
        for (String student : studentNames) {
            System.out.println("- " + student);
        }

        scanner.close();
    }
}
