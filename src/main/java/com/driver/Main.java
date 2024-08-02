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
        int p1=p.product(8,7);
        int p2=p.p.product(5,4,6);
        double p3=p.product(2.0,4.0,5.0);
    }
}