package day3;

import day2.Student;
public class Product {
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price*quantity;
    }

    public double getPrice(int quantity,int quantity1) {
        return price * (quantity + quantity1);
    }
    public static void main(String[] args) {


        Product apple = new Product();
        apple.setPrice(7.6);
        System.out.println("price is " + apple.getPrice());
}
}
