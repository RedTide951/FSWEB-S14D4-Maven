package org.example.model;

public class Coke extends ProductForSale {

    private int customVariable = 1;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println(getPrice());
        System.out.println(getType());
        System.out.println(getDescription());
        System.out.println(customVariable);
    }
}
