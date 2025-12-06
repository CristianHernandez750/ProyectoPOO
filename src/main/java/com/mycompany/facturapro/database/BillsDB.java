package com.mycompany.facturapro.database;

import com.mycompany.facturapro.Bill.Bill;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class BillsDB {

    public boolean generarFactura(String sellerName, String customerName, long total) {

        String sql = "INSERT INTO bills (seller_name, customer_name, total) VALUES (?, ?, ?)";

        try (Connection conn = dbConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, sellerName);
            ps.setString(2, customerName);
            ps.setLong(3, total);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void buscarFactura(String customerName, JTextArea txtSeller, JTextArea txtCustomer, JTextArea txtDate) {
        String query = "SELECT seller_name, customer_name, billing_date FROM bills WHERE customer_name = ?";

        try (Connection conn = dbConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, customerName.trim());

            ResultSet rs = ps.executeQuery();

            boolean hayResultados = false;

            txtSeller.setText("");
            txtCustomer.setText("");
            txtDate.setText("");

            while (rs.next()) {
                hayResultados = true;
                String sellerName = rs.getString("seller_name");
                String billingDate = rs.getDate("billing_date").toString().trim();
                txtSeller.append(sellerName + "\n");
                txtCustomer.append(customerName + "\n");
                txtDate.append(billingDate + "\n");
            }

            if (!hayResultados) {
                JOptionPane.showMessageDialog(null, "No se encontraron facturas del cliente: " + customerName);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar facturas: " + e.getMessage());
        }
    }

}
