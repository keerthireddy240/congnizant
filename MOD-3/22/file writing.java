import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String input = scanner.nextLine();

        try {
            // Create FileWriter object to write to output.txt
            FileWriter writer = new FileWriter("output.txt");

            // Write the input string to the file
            writer.write(input);

            // Close the writer to save the file
            writer.close();

            System.out.println("Data has been successfully written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
