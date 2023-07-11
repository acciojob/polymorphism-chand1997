package com.driver;

public class Main {
    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }

    }

    public static void main(String[] args) {
        Product p=new Product();
        System.out.println(p.product(2,44));
        System.out.println(p.product(11,33,22));
    }

}