package com.mycompany.facturapro.Users;

public class LegalEntity extends Person {

    public LegalEntity(String nombre, long id) {
        super(nombre, "NIT", id);
    }

    @Override
    public long getId() {
        return super.getId(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTypeId() {
        return super.getTypeId(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "=== CLIENTE ===\n"
                + "Nombre: " + this.getNombre() + "\n"
                + "ID: " + this.getId() + "\n"
                + "Tipo: "+this.getTypeId();
    }

}
