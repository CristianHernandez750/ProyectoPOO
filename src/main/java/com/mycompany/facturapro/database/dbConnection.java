package com.mycompany.facturapro.database;
import java.sql.*;

public class dbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/poo";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn=DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
