package org.example.model;

public class Bread extends ProductForSale {

    private int customVariable = 1;

    public Bread(String type, int price, String description) {
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
