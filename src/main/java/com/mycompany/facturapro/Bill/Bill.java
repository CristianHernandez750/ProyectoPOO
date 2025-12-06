/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facturapro.Bill;

import com.mycompany.facturapro.Users.Person;
import com.mycompany.facturapro.product.Product;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Usuario
 */
public class Bill {
    private Person seller;
    private Person client;
    private List<Product> productos;
    private LocalDateTime billingDate;
    private long totalPrice;

    public Bill(Person seller, Person client, List<Product> productos, long totalPrice) {
        this.seller = seller;
        this.client = client;
        this.productos = productos;
        this.billingDate = LocalDateTime.now();
        this.totalPrice = totalPrice;
    }
    
    public void addProduct(Product producto){
        productos.add(producto);
    }
    
    public void removeProduct(Product producto){
        productos.remove(producto);
    }
    
    public String seeProducts(){
        return productos.stream()
                .map(producto -> producto.getName() + " - Cantidad: " + producto.getCantidad() + " - Precio: " + producto.getPrice()*producto.getCantidad())
                .collect(Collectors.joining("\n"));
    }
    
    public String printBill(){
        return "Vendedor: " + seller.getNombre() + "\n"
                + "Cliente: " + client.getNombre() + "\n"
                + this.seeProducts() + "\n"
                + "TOTAL: " + this.totalPrice + "\n"
                + "Fecha de registro: " + this.billingDate;
    }

    public Person getClient() {
        return client;
    }
    
    
}
