package com.mycompany.facturapro.database;

import java.sql.*;

public class LoginDB {
    String sellerName;    
    
    public String autenticar(String username, String password) {
        String query = "SELECT name_seller FROM seller WHERE username = ? && password = ?";

        try (Connection conn = dbConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                sellerName = rs.getString("name_seller");
                return sellerName;
            } else {
                return null;

            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
            return null;
        }
    }

    public String getSellerName() {
        return sellerName;
    }    
}
