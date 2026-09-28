import java.sql.*;

public class InsertExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/login_schema", "root", "Madamji");

            // Step 3: Prepare SQL insert statement
            String sql = "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Step 4: Set values
            pstmt.setString(1, "Alice");
            pstmt.setInt(2, 21);
            pstmt.setString(3, "Computer Science");

            // Step 5: Execute update
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) inserted successfully!");

            // Step 6: Close resources
            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}