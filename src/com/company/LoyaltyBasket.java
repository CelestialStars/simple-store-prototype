package com.company;

import java.util.List;

public class LoyaltyBasket extends StoreBasket implements Payable {
    private int points;

    public LoyaltyBasket() {
    }

    public LoyaltyBasket(double netAmount, double totalAmount, double vat, List listOfItems, String storeAddress, String cashierName) {
        super(netAmount, totalAmount, vat, listOfItems, storeAddress, cashierName);
    }

    @Override
    public void basketInfo() {
        super.basketInfo();
    }

    @Override
    public void pay() {
        // write all logic to calculate the totalAmount user has to pay
    }

    public void calculateBonus() {
        points = (int) (getTotalAmount() / 15);
    }
}
