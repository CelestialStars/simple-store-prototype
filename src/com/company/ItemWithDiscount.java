package com.company;

import static com.company.Runner.todayDiscountPercent;


public class ItemWithDiscount extends Item {
    private double discount;

    public ItemWithDiscount() {
    }

    public ItemWithDiscount(String name, double price) {
        super(name, price);
        this.discount = todayDiscountPercent;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    @Override
    public void printInfo(Item item) {
        super.printInfo(item);
    }

    public void calculateDiscount() {
        double finalPrice = getPrice() * discount;
        System.out.println("Final price after discount is " + finalPrice);
    }

    @Override
    public String toString() {
        return "ItemWithDiscount{" +
                "discount=" + discount +
                ", discount=" + discount +
                '}';
    }
}

