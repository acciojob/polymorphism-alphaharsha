package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p=new Product();
        p.product(8,7);
        p.product(5,4,6);
        p.product(2.0,4.0,5.0);
    }
}