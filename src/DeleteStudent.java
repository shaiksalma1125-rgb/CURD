import java.sql.*;

public class DeleteStudent {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/login_schema";
        String user = "root";
        String password = "Madamji";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String sql = "DELETE FROM students WHERE id=2";

            int rows = stmt.executeUpdate(sql);

            if (rows > 0)
                System.out.println("Student deleted successfully.");
            else
                System.out.println("Student not found.");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
