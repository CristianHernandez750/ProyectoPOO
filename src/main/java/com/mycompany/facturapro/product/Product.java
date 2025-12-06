package com.mycompany.facturapro.product;

public class Product {

    private String name;
    private String description;
    private long price;
    private int stock;
    private int cantidad;

    public Product(String name, String description, long price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.cantidad = 0;
    }

    public String verProduto() {

        String producto = "Nombre: " + name + "\nDescripción: " + description + "\nPrecio: " + price + "\nCantidad: " + stock;

        return producto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
