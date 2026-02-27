package com.example;

public class Product {

    //  ATRIBUTOS 
    private String id;
    private String name;
    private double price;
    private int stock;

    //  CONSTRUCTOR 
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //  GETTERS 
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    //  SETTERS
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // MÉTODO toString 
    
    public String toString() {
        return "Producto [ID: " + id +
               ", Nombre: " + name +
               ", Precio: " + price +
               ", Stock: " + stock + "]";
    }

}