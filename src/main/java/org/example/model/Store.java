package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale [] foodArray = new ProductForSale [3];
        foodArray[0] = new Chocolate("Sweet", 2, "Choco");
        foodArray[1] = new Coke("Drink", 4, "Best");
        foodArray[2] = new Coke("Food", 5, "Needed");

        listProducts(foodArray);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i].showDetails();
        }
    }
}