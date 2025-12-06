package com.mycompany.facturapro;

import com.mycompany.facturapro.GUI.Login;
import com.mycompany.facturapro.database.dbConnection;

public class FacturaPro {

    public static void main(String[] args) {
        dbConnection dbc = new dbConnection();
        Login platform = new Login();
        
        dbc.getConnection();
        platform.setVisible(true);
        platform.setLocationRelativeTo(null);
    }
}
