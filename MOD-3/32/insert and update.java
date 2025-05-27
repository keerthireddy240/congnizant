import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    private static final String DB_URL = "jdbc:sqlite:students.db";

    // Method to insert a student record
    public void insertStudent(String name, String grade) {
        String sql = "INSERT INTO students (name, grade) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, grade);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " student(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update a student's grade by ID
    public void updateStudentGrade(int id, String newGrade) {
        String sql = "UPDATE students SET grade = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newGrade);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " student(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
