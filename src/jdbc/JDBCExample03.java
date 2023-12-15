package jdbc;

import java.sql.*;

public class JDBCExample03 {

    public static void main(String[] args) throws SQLException {

        find(90);

    }


    private static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/store";
        Connection conn = DriverManager.getConnection(url, "root", "admin");
        System.out.println("Connected to database!");
        return conn;
    }

    public static void insertProduct(String nome_produto, double custo_unit) {
        String sql = "INSERT INTO sales (nome_produto, custo_unit) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome_produto);
            pstmt.setDouble(2, custo_unit);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void find(long id) {
        var sql = "SELECT * FROM sales WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println(rs.getInt("id") + ", " +
                            rs.getString("nome_produto") + ", " +
                            rs.getDouble("custo_unit"));
                } else {
                    System.out.println("No product found!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void listProducts() {
        String sql = "SELECT * FROM sales";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " +
                        rs.getString("nome_produto") + ", " +
                        rs.getDouble("custo_unit"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void updateProduct(int id, String nome_produto, double custo_unit) {
        String sql = "UPDATE sales SET nome_produto = ?, custo_unit = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome_produto);
            pstmt.setDouble(2, custo_unit);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deleteProduct(int id) {
        String sql = "DELETE FROM sales WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
