package com.driver;

public class Main {

    public static void main(String[] args) {

        Product p = new Product();

        p.product(2, 4);
        p.product(4, 5, 7);
        p.product(4.3314159, 5.7765675746);

    }





}

class Product {

    public int product(int x, int y) {
        System.out.println(" 1st method ");
        return x + y;
    }

    public int product (int x, int y, int z) {
        System.out.println(" method overloading " + x + " " + y + " " + z);
        return x + y + z;
    }

    public double product (double x, double y) {
        System.out.println(" method overloading " + x + " " + y);
        return x + y;
    }

}