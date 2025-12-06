package com.mycompany.facturapro.Users;
public abstract class Person {

    private String nombre;
    
    private String typeId;
    private long id;
    
    public Person(String nombre, String typeId, long id) {
        this.nombre = nombre;
        this.typeId = typeId;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTypeId() {
        return typeId;
    }

    public long getId() {
        return id;
    }
   
}
