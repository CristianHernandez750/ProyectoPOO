package com.mycompany.facturapro.database;

import com.mycompany.facturapro.Users.LegalEntity;
import com.mycompany.facturapro.Users.NaturalPerson;
import com.mycompany.facturapro.Users.Person;
import java.sql.*;
import javax.swing.JOptionPane;

public class CustomerDB {

    public Person buscarCliente(String nameCustomer) {

        String query = "SELECT Name_customer, Typeid, id FROM customer WHERE Name_customer = ?";

          try (PreparedStatement ps = dbConnection.getConnection().prepareStatement(query)) {
            ps.setString(1, nameCustomer);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombreBD = rs.getString("Name_Customer");
                String tipo = rs.getString("Typeid");
                long id = rs.getLong("id");

                if (tipo.equalsIgnoreCase("natural")) {
                    return new NaturalPerson(nombreBD, id);
                } else {
                    return new LegalEntity(nombreBD, id);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public boolean insertarCliente(String nameCustomer, String typeId, String id) {
        String query = "INSERT INTO customer (name_customer, typeId, id) VALUES (?, ?, ?)";

        try (Connection conn = dbConnection.getConnection(); PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setString(1, nameCustomer);
            pst.setString(2, typeId);
            pst.setString(3, id);

            pst.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void mostrarClientes() {

        String query = "SELECT Name_customer, Typeid, id FROM customer";

        StringBuilder mensaje = new StringBuilder();
        mensaje.append("CLIENTES\n\n");

        try (Connection conn = dbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                mensaje.append("Nombre: ")
                       .append(rs.getString("Name_customer"))
                       .append("\nTipo de identificación: ")
                       .append(rs.getString("Typeid"))
                       .append("\nNúmero de identificación: ")
                       .append(rs.getString("id"))
                       .append("\n------------------------\n");
            }

            JOptionPane.showMessageDialog(null, mensaje.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
