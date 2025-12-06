package com.mycompany.facturapro.GUI;

import com.mycompany.facturapro.database.ProductsDB;
import com.mycompany.facturapro.product.Product;
import java.sql.*;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class ProductScreen extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProductScreen.class.getName());
    private List<Product> inventario;
    private Menu menu;

    public ProductScreen(List<Product> inventario, Menu menu) {
        initComponents();
        this.inventario = inventario;
        this.menu = menu;

        this.UpdateTable();
    }

    public void UpdateTable() {
        txtProduct.setText(inventario.stream().map(p -> p.getName()).collect(Collectors.joining("\n")));
        txtDescription.setText(inventario.stream().map(p -> p.getDescription()).collect(Collectors.joining("\n")));
        txtPrice.setText(inventario.stream().map(p -> String.valueOf(p.getPrice())).collect(Collectors.joining("\n")));
        txtStock.setText(inventario.stream().map(p -> String.valueOf(p.getStock())).collect(Collectors.joining("\n")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fieldAgregar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldCrear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldEliminar = new javax.swing.JTextField();
        spinnerCantidad = new javax.swing.JSpinner();
        spinnerCrear = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProduct = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtStock = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPrice = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Inventario: ");

        jLabel3.setText("Producto");

        jLabel4.setText("Descripción");

        jLabel5.setText("Precio");

        jLabel6.setText("Stock");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Acciones:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnCrear.setText("Crear");
        btnCrear.addActionListener(this::btnCrearActionPerformed);

        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(this::btnEliminarProductoActionPerformed);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        jLabel7.setText("Ingrese el nombre de un producto agregar si lo desea");

        jLabel8.setText("Ingrese el nombre de un producto a crear si lo desea");

        jLabel9.setText("Ingrese el nombre de un producto a eliminar si lo desea");

        txtProduct.setEditable(false);
        txtProduct.setRows(5);
        jScrollPane1.setViewportView(txtProduct);

        txtDescription.setEditable(false);
        txtDescription.setRows(5);
        jScrollPane2.setViewportView(txtDescription);

        txtStock.setEditable(false);
        txtStock.setRows(5);
        jScrollPane3.setViewportView(txtStock);

        txtPrice.setEditable(false);
        txtPrice.setRows(5);
        jScrollPane4.setViewportView(txtPrice);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCrear)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addComponent(btnAgregar)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarProducto)
                                .addComponent(fieldEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCerrar)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrear)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(fieldEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarProducto)
                        .addGap(35, 35, 35)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane1))))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombre = fieldCrear.getText().trim();
        String description = null;
        long price = 0;
        int cantidad = 0;

        Product newProduct = null;

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de producto");
            return;
        }

        try {
            description = JOptionPane.showInputDialog("Ingrese una descripción del producto:");
            if (description == null) {
                return;
            }

            cantidad = Integer.parseInt(spinnerCrear.getValue().toString());

            String priceInput = JOptionPane.showInputDialog("Ingrese el precio del producto:");
            if (priceInput == null) {
                return;
            }
            price = Long.parseLong(priceInput);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: La cantidad o el precio ingresado no es válido.");
            return;
        }

        if (cantidad <= 0 || price <= 0) {
            JOptionPane.showMessageDialog(null, "La cantidad y el precio deben ser mayores a cero.");
            return;
        }
        newProduct = new Product(nombre, description, price, cantidad);
        inventario.add(newProduct);
        menu.setInventario(inventario);
        this.UpdateTable();
        try {
            ProductsDB product = new ProductsDB();
            boolean existe = product.existenciaProducto(nombre);
            boolean result = product.crearProducto(nombre, description, price, cantidad);
            if (result && !existe) {
                JOptionPane.showMessageDialog(null, "Producto '" + nombre + "' creado con exito.");
            } else if (existe) {
                JOptionPane.showMessageDialog(null, "Error al crear, el producto ya existe");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
        fieldCrear.setText("");
        spinnerCrear.setValue(0);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = fieldAgregar.getText().trim();
        int cantidad = Integer.parseInt(spinnerCantidad.getValue().toString());
        ProductsDB product = new ProductsDB();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del producto.");
            return;
        }
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.");
            return;
        }

        Product producto = product.buscarProducto(nombre);

        if (producto == null) {
            JOptionPane.showMessageDialog(null, "No se encontró un producto con ese nombre.");
            return;
        }
        producto.setStock(producto.getStock() + cantidad);
        product.actualizarStock(producto);

        JOptionPane.showMessageDialog(null, "Producto agregado");

        inventario.add(producto);
        menu.setInventario(inventario);
        this.UpdateTable();
        fieldAgregar.setText("");
        spinnerCantidad.setValue(0);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        String productName = fieldEliminar.getText().trim();

        if (productName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del producto.");
            return;
        }
        ProductsDB product = new ProductsDB();
        boolean eliminado = product.eliminarProducto(productName);
        Product producto = inventario.stream().filter(p -> p.getName().equalsIgnoreCase(productName)).findFirst().orElse(null);

        if (eliminado) {
            inventario.remove(producto);
            JOptionPane.showMessageDialog(null, "Producto eliminado");
            fieldEliminar.setText("");
            this.UpdateTable();
        } else {
            JOptionPane.showMessageDialog(null, "El producto ingresado no existe");
        }

    }//GEN-LAST:event_btnEliminarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JTextField fieldAgregar;
    private javax.swing.JTextField fieldCrear;
    private javax.swing.JTextField fieldEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerCrear;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtPrice;
    private javax.swing.JTextArea txtProduct;
    private javax.swing.JTextArea txtStock;
    // End of variables declaration//GEN-END:variables
}
