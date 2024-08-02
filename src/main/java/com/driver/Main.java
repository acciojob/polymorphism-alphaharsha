package com.driver;

public class Main {
   public static class Product{

        public static int product(int x, int y){
            return x*y;
        }
        public static int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {

        Product P = new Product();
        P.product(1, 2);
        P.product(2, 3, 4);
        P.product(3.5, 4.7);


    }
}
