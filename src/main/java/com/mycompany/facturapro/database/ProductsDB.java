package com.mycompany.facturapro.database;

import com.mycompany.facturapro.product.Product;
import java.sql.*;
import javax.swing.JOptionPane;

public class ProductsDB {

    public boolean crearProducto(String productName, String productDescription, long unityPrice, int stock) {
        String query = "INSERT INTO inventory (product_name, product_description, unity_price, stock) VALUES (?, ?, ?, ?)";

        try (Connection conn = dbConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, productName);
            ps.setString(2, productDescription);
            ps.setLong(3, unityPrice);
            ps.setInt(4, stock);

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean existenciaProducto(String productName) throws SQLException {
        boolean exists = false;

        Connection conn = dbConnection.getConnection();
        String query = "SELECT 1 FROM inventory WHERE product_name= ? LIMIT 1";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, productName);

        ResultSet rs = ps.executeQuery();
        exists = rs.next();

        return exists;
    }

    public Product buscarProducto(String productName) {
        String query = "SELECT * FROM inventory WHERE product_name = ?";
        try (Connection conn = dbConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, productName);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Product(
                        rs.getString("product_name"),
                        rs.getString("product_description"),
                        rs.getLong("unity_price"),
                        rs.getInt("stock")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizarStock(Product p) {
        String query = "UPDATE inventory SET stock = ? WHERE product_name = ?";
        try (Connection conn = dbConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, p.getStock());
            ps.setString(2, p.getName());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean eliminarProducto(String productName) {
        String query = "DELETE FROM inventory WHERE product_name = ?";
        try (Connection conn = dbConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, productName);
            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public void mostrarInventario() {

        String query = "SELECT product_name,unity_price,stock FROM inventory";

        StringBuilder mensaje = new StringBuilder();
        mensaje.append("INVENTARIO ACTUAL\n\n");

        try (Connection conn = dbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                mensaje.append("Producto: ")
                       .append(rs.getString("product_name"))
                       .append("\nPrecio: $")
                       .append(rs.getDouble("unity_price"))
                       .append("\nStock: ")
                       .append(rs.getInt("stock"))
                       .append("\n------------------------\n");
            }

            JOptionPane.showMessageDialog(null, mensaje.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
