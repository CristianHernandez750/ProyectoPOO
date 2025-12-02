
package com.mycompany.facturapro.GUI;

import com.mycompany.facturapro.Bill.Bill;
import com.mycompany.facturapro.Users.Person;
import com.mycompany.facturapro.product.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class BillScreen extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BillScreen.class.getName());
    private Menu menu;
    private List<Product> inventario;
    private List<Person> clients;
    private List<Bill> facturas;
    private Person seller;
    List<Product> productosFacturar = new ArrayList<>();

    public BillScreen(Menu menu, List<Product> inventario, List<Person> clients, List<Bill> facturas, Person seller) {
        initComponents();
        this.inventario = inventario;
        this.clients = clients;
        this.facturas = facturas;
        this.menu = menu;
        this.seller = seller;
        this.UpdateTable();
    }
    
    public void UpdateTable(){
        fieldSeller.setText(facturas.stream().map(p -> p.getSeller().getNombre()).collect(Collectors.joining("\n")));
        fieldClient.setText(facturas.stream().map(p -> p.getClient().getNombre()).collect(Collectors.joining("\n")));
        fieldDate.setText(facturas.stream().map(p -> p.getBillingDate().toString()).collect(Collectors.joining("\n")));
    }

    public void UpdateTableProduct(){
        productField.setText(productosFacturar.stream().map(p -> p.getName()).collect(Collectors.joining("\n")));
        quantityField.setText(productosFacturar.stream().map(p -> String.valueOf(p.getCantidad())).collect(Collectors.joining("\n")));
        priceField.setText(productosFacturar.stream().map(p -> String.valueOf(p.getCantidad()*p.getPrice())).collect(Collectors.joining("\n")));
        txtTotalPrice.setText(String.valueOf(productosFacturar.stream().mapToLong(p -> p.getCantidad()*p.getPrice()).sum()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldSeller = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldClient = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        fieldDate = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JSpinner();
        btnQuitarProducto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        productField = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        quantityField = new javax.swing.JTextArea();
        btnGenerarFactura = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnBuscarFactura = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnVerClientes = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        priceField = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Facturación");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Historial de Facturas");

        jLabel3.setText("Vendedor");

        jLabel4.setText("Cliente");

        jLabel5.setText("Fecha");

        fieldSeller.setEditable(false);
        fieldSeller.setRows(5);
        jScrollPane1.setViewportView(fieldSeller);

        fieldClient.setEditable(false);
        fieldClient.setRows(5);
        jScrollPane2.setViewportView(fieldClient);

        fieldDate.setEditable(false);
        fieldDate.setRows(5);
        jScrollPane3.setViewportView(fieldDate);

        btnAgregar.setText("Agregar Producto");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        jLabel6.setText("Cliente: ");

        jLabel7.setText("Producto:");

        btnQuitarProducto.setText("Quitar Producto");
        btnQuitarProducto.addActionListener(this::btnQuitarProductoActionPerformed);

        jLabel8.setText("Productos a facturar: ");

        jLabel9.setText("Producto");

        jLabel10.setText("Cantidad");

        productField.setEditable(false);
        productField.setColumns(1);
        productField.setRows(5);
        jScrollPane4.setViewportView(productField);

        quantityField.setEditable(false);
        quantityField.setColumns(1);
        quantityField.setRows(5);
        jScrollPane5.setViewportView(quantityField);

        btnGenerarFactura.setText("Generar factura");
        btnGenerarFactura.addActionListener(this::btnGenerarFacturaActionPerformed);

        btnInventario.setText("Inventario");
        btnInventario.addActionListener(this::btnInventarioActionPerformed);

        btnBuscarFactura.setText("Buscar Factura");
        btnBuscarFactura.addActionListener(this::btnBuscarFacturaActionPerformed);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Generación de factura");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        btnVerClientes.setText("Ver clientes");
        btnVerClientes.addActionListener(this::btnVerClientesActionPerformed);

        priceField.setEditable(false);
        priceField.setRows(5);
        jScrollPane7.setViewportView(priceField);

        jLabel12.setText("Precio");

        jLabel13.setText("TOTAL:");

        txtTotalPrice.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInventario)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVerClientes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantity))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(12, 12, 12))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(20, 20, 20)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(btnAgregar)
                                                            .addGap(81, 81, 81))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jLabel9))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnLimpiar))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btnGenerarFactura)
                                                        .addGap(24, 24, 24)
                                                        .addComponent(btnCerrar))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtTotalPrice)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(24, 24, 24))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(btnQuitarProducto)
                                            .addComponent(jLabel11))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarFactura)
                    .addComponent(btnInventario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerClientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jScrollPane7))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtTotalPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerarFactura)
                            .addComponent(btnCerrar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacturaActionPerformed
        // TODO add your handling code here:
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente a buscar").trim();
        
        Bill factura = facturas.stream()
                        .filter(p -> p.getClient().getNombre().equalsIgnoreCase(nombre))
                        .findFirst()
                        .orElse(null);
        
        if(factura == null){
            JOptionPane.showMessageDialog(null, "El cliente ingresado no existe");
        }else{
            List<Bill> facturaLista = facturas.stream()
                        .filter(p -> p.getClient().getNombre().equalsIgnoreCase(nombre))
                        .toList();
            
            JOptionPane.showMessageDialog(null, facturaLista.stream().map(p -> p.printBill()).toList());
        }
    }//GEN-LAST:event_btnBuscarFacturaActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, inventario.stream()
                                                .map(p -> "Nombre: " + p.getName()+ "\nDescripción: " + p.getDescription() + "\nStock: " + p.getStock() + "\nPrecio: " +  p.getPrice() + "\n")
                                                .toList());
        
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String element = txtProduct.getText().trim();
        Product producto = inventario.stream().filter(p -> p.getName().equalsIgnoreCase(element)).findFirst().orElse(null);

        if(producto != null){
            int cantidad = 0;
            try{
                cantidad = Integer.parseInt(txtQuantity.getValue().toString());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El valor ingresado en la cantidad no es válido");
            }
            
            if(cantidad > 0){
                if(cantidad > producto.getStock()){
                    JOptionPane.showMessageDialog(null, "La cantidad ingresada es mayor que la cantidad de productos en el inventario");
                }else{
                    producto.setCantidad(cantidad);
                    producto.setStock(producto.getStock()-producto.getCantidad());
                    productosFacturar.add(producto);
                    this.UpdateTableProduct();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "El producto ingresado no existe");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoActionPerformed
        // TODO add your handling code here:
        String element = txtProduct.getText().trim();
        Product producto = productosFacturar.stream().filter(p -> p.getName().equalsIgnoreCase(element)).findFirst().orElse(null);

        if(producto != null){
            producto.setStock(producto.getStock()+producto.getCantidad());
            producto.setCantidad(0);
            productosFacturar.remove(producto);
            this.UpdateTableProduct();
            
        }else{
            JOptionPane.showMessageDialog(null, "El producto ingresado no existe");
        }
    }//GEN-LAST:event_btnQuitarProductoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtClient.setText("");
        txtProduct.setText("");
        txtQuantity.setValue(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        // TODO add your handling code here:
        String nombre = txtClient.getText().trim();
        long totalPrice = productosFacturar.stream().mapToLong(p -> p.getCantidad()*p.getPrice()).sum();
        Person cliente = clients.stream().filter(p -> p.getNombre().equalsIgnoreCase(nombre)).findFirst().orElse(null);
        
        if(productosFacturar.size() <= 0){
            JOptionPane.showMessageDialog(null, "Debe ingresar productos para poder facturar");
        }else{
            if(cliente != null){
                Bill factura = new Bill(seller ,cliente, productosFacturar, totalPrice);
                facturas.add(factura);
                JOptionPane.showMessageDialog(null, factura.printBill());
                menu.setInventario(inventario);
                menu.setFacturas(facturas);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El cliente ingresado no existe");
            }
        }
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClientesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, clients.stream().map(p -> p.getNombre()).collect(Collectors.joining("\n")));
        
    }//GEN-LAST:event_btnVerClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarFactura;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnQuitarProducto;
    private javax.swing.JButton btnVerClientes;
    private javax.swing.JTextArea fieldClient;
    private javax.swing.JTextArea fieldDate;
    private javax.swing.JTextArea fieldSeller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea priceField;
    private javax.swing.JTextArea productField;
    private javax.swing.JTextArea quantityField;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JSpinner txtQuantity;
    private javax.swing.JLabel txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
