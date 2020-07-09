package com.company;

public class ItemTakeItAll extends ItemWithDiscount {
    private int minimumNumberToBuy;


    public ItemTakeItAll(String name, double price) {
        super(name, price);
    }

    public ItemTakeItAll() {

    }

    public int getMinimumNumberToBuy() {
        return minimumNumberToBuy;
    }

    public void setMinimumNumberToBuy(int minimumNumberToBuy) {
        this.minimumNumberToBuy = minimumNumberToBuy;
    }

    @Override
    public void calculateDiscount() {
        super.calculateDiscount();
    }

    @Override
    public void printInfo(Item item) {
        super.printInfo(item);
    }
}
