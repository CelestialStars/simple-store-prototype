package com.company;

import static com.company.Runner.todayDiscountPercent;

public class DiscountIndependence extends ItemWithDiscount {
    private int discountIndependencevalue;

    public DiscountIndependence(String name, double price) {
        super(name, price);
    }

    public DiscountIndependence() {

    }

    public int getDiscountIndependencevalue() {
        return discountIndependencevalue;
    }

    public void setDiscountIndependencevalue(int discountIndependencevalue) {
        this.discountIndependencevalue = discountIndependencevalue;
    }

    @Override
    public void calculateDiscount() {
        double finalPrice = getPrice() * (discountIndependencevalue + todayDiscountPercent);
        System.out.println("Final price after discount is " + finalPrice);
    }

    @Override
    public void printInfo(Item item) {
        super.printInfo(item);
    }
}

