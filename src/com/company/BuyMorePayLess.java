package com.company;

public class BuyMorePayLess extends Item {
    private int maximumNumberAllowed = 10;
    private int boughtItems;
    private double paidItems;

    public int getMaximumNumberAllowed() {
        return maximumNumberAllowed;
    }

    public void setMaximumNumberAllowed(int maximumNumberAllowed) {
        this.maximumNumberAllowed = maximumNumberAllowed;
    }

    public int getBoughtItems() {
        return boughtItems;
    }

    public void setBoughtItems(int boughtItems) {
        this.boughtItems = boughtItems;
    }

    public double getPaidItems() {
        return paidItems;
    }


    public void setPaidItems(double paidItems) {
        this.paidItems = paidItems;
    }

    @Override
    public String toString() {
        return "BuyMorePayLess{" +
                "maximumNumberAllowed=" + maximumNumberAllowed +
                ", boughtItems=" + boughtItems +
                ", paidItems=" + paidItems +
                '}';
    }


    @Override
    public void printInfo(Item item) {
        super.printInfo(item);
    }
}
