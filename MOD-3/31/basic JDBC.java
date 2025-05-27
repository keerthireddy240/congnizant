import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // SQLite DB file

        try {
            // Load the SQLite JDBC driver (automatically done in recent versions)
            Class.forName("org.sqlite.JDBC");

            // Create a connection to the database
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connected to the database.");

            // Create a statement and execute a SELECT query
            Statement stmt = conn.createStatement();
            String query = "SELECT id, name, grade FROM students";
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result set and print results
            System.out.println("Student Records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String grade = rs.getString("grade");

                System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
