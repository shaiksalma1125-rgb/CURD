
import java.sql.*;

public class UpdateStudentCourse {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/login_schema";
        String user = "root";
        String password = "Madamji";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String sql = "UPDATE students SET course='AI & ML' WHERE id=1";

            int rows = stmt.executeUpdate(sql);

            if (rows > 0)
                System.out.println("Course updated successfully.");
            else
                System.out.println("Student not found.");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}