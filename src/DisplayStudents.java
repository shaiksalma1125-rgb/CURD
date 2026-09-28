import java.sql.*;

public class DisplayStudents {
    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/login_schema";
        String user = "root";
        String password = "Madamji"; // Change if your MySQL password is different

        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute SELECT query
            String sql = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(sql);

            // Step 5: Display records
            System.out.println("Student Records");
            System.out.println("-------------------------------");

            while (rs.next()) {
                System.out.println("ID      : " + rs.getInt("id"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("Age     : " + rs.getInt("age"));
                System.out.println("Course  : " + rs.getString("course"));
                System.out.println("-------------------------------");
            }

            // Step 6: Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}