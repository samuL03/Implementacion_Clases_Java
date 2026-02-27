package com.example;

public class Main {
    public static void main(String[] args) {

        // Crear dos objetos
        Product p1 = new Product("P001", "Pc", 1200.0, 50);
        Product p2 = new Product("P002", "Mouse", 25.0, 100);

        // Modificar atributos usando setters
        p1.setPrice(1300.0);
        p2.setStock(80);

        // Imprimir usando getters
        System.out.println("Nombre p1: " + p1.getName());
        System.out.println("Precio p1: " + p1.getPrice());

        System.out.println("Nombre p2: " + p2.getName());
        System.out.println("Stock p2: " + p2.getStock());

        System.out.println();

        // Imprimir objeto completo
        System.out.println(p1);
        System.out.println(p2);
    
    }
}