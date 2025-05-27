import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) {
        try {
            // Open output.txt for reading
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;

            System.out.println("Contents of output.txt:");

            // Read and print each line until end of file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
