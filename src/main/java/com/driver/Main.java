package com.driver;

public class Main {

    static class Product extends Main {

        public int product(int x, int y) {
            return x * y;
        }

        public int product (int x, int y, int z) {
            return x * y * z;
        }

        public double product (double x, double y) {
            return x * y;
        }

    }

    public static void main(String[] args) {

        Product p = new Product();

        System.out.println("Product of 2 and 3 (int): " + p.product(2, 3));
        System.out.println("Product of 2, 3 and 4 (int): " + p.product(2, 3, 4));
        System.out.println("Product of 2.5 and 3.5 (double): " + p.product(2.5, 3.5));

    }

}

