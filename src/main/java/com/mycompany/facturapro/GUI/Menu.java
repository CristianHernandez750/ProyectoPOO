package com.mycompany.facturapro.GUI;

import com.mycompany.facturapro.Bill.Bill;
import com.mycompany.facturapro.Users.Person;
import com.mycompany.facturapro.Users.NaturalPerson;
import com.mycompany.facturapro.database.CustomerDB;
import com.mycompany.facturapro.database.LoginDB;
import com.mycompany.facturapro.product.Product;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());

    private String sellerName;
    private Person vendedor = new NaturalPerson(sellerName,12345);
    private List<Product> inventario;
    private List<Person> clients;
    private List<Bill> facturas;
    String product;

    public Menu() {
        initComponents();
        this.inventario = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.facturas = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("FacturaPro");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        btnBuscarCliente.setText("Buscar cliente");
        btnBuscarCliente.addActionListener(this::btnBuscarClienteActionPerformed);

        btnNuevoCliente.setText("Nuevo cliente");
        btnNuevoCliente.addActionListener(this::btnNuevoClienteActionPerformed);

        btnProduct.setText("Menú productos");
        btnProduct.addActionListener(this::btnProductActionPerformed);

        jButton1.setText("Facturas");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("¿Qué deseas realizar?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCerrar))
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 211, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        String element = JOptionPane.showInputDialog("Ingrese el nombre del cliente a buscar: ");
        while (true) {

            if (element == null) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre.");
                return;
            }
            if (element.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre.");
                continue;
            }
            break;
        }

        CustomerDB cliente = new CustomerDB();
        Person persona = cliente.buscarCliente(element);

        while (persona == null) {
            JOptionPane.showMessageDialog(null, "No se encontró un cliente con ese nombre.");
            element = JOptionPane.showInputDialog("Ingrese el nombre del cliente a buscar: ");
            if (element == null) {
                return;
            }
            if (element.trim().isEmpty()) {
                continue;
            }
            persona = cliente.buscarCliente(element);
        }
        JOptionPane.showMessageDialog(null, persona.toString());


    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // TODO add your handling code here:

        NewClientScreen pantalla = new NewClientScreen(this);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        ProductScreen pantalla = new ProductScreen(inventario, this);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProductActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BillScreen pantalla = new BillScreen(this, inventario, clients, facturas, vendedor);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setClient(Person p) {
        clients.add(p);
        JOptionPane.showMessageDialog(null, "Cliente agregado");
    }

    public List<Person> getClients() {
        return clients;
    }

    public void setInventario(List<Product> inventario) {
        this.inventario = inventario;
    }

    public void setFacturas(List<Bill> facturas) {
        this.facturas = facturas;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
