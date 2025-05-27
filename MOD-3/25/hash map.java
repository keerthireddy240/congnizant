import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.println("Add student entries (ID and name). Type -1 to stop.");

        // Allow user to add entries
        while (true) {
            System.out.print("Enter Student ID (or -1 to finish): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (id == -1) {
                break;
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        // Retrieve and display name based on ID
        System.out.print("\nEnter a Student ID to search: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }

        scanner.close();
    }
}
