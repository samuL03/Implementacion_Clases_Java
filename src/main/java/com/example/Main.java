package com.example;

public class Main {
    public static void main(String[] args) {
    
    Product product1 = new Product();
    Product product2 = new Product();

    product1.setid("2");
    product1.setname("manzana");
    product1.setprice(2000);
    product1.setstock(5);

    product2.setid("6");
    product2.setname("pera");
    product2.setprice(4500);
    product2.setstock(2);

    System.out.println("product ID: " + product1.getid());
    System.out.println("product name: " + product1.getid());
    System.out.println("product price: " + product1.getid());
    System.out.println("product stock: " + product1.getid()); 

    System.out.println("product ID " + product1.getid());
    System.out.println("product name: " + product1.getid());
    System.out.println("product price: " + product1.getid());
    System.out.println("product stock: " + product1.getid());

    System.out.println(product1.toString());
    System.out.println(product2.toString());

  }
}