import java.sql.*;

public class CreateTableExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/login_schema", "root", "Madamji");

            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50) NOT NULL, " +
                    "age INT, " +

                    "course VARCHAR(50))";

            stmt.executeUpdate(sql);
            System.out.println("Table 'students' created successfully!");


            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


