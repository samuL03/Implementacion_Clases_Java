package com.example;

public class Product {

    //atributos
    private String id;
    private String name;
    private double price;
    private int stock;

    //Metodo getter

    public String getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getprice() {
        return price;
    }

    public int getstock() {
        return stock;
    }

    //Metodo setter

    public void setname(String name) {
        this.name = name;
    }

    public void setid(String id) {
        this.id = id;
    }

    public void setprice(double price) {
        this.price = price;
    }
    public void setstock(int stock) {
        this.stock = stock;
    }


    //metodo ToString

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }


    
}
