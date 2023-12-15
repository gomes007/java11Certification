package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample02 {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection using try-with-resources
            String url = "jdbc:mysql://localhost:3306/store";
            try (Connection conn = DriverManager.getConnection(url, "root", "admin");
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM store.sales")) {

                // Iterate through the result set
                while (rs.next()) {
                    System.out.println(rs.getString("nome_produto") + ", " + rs.getString("custo_unit"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
