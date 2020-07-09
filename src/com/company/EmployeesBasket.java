package com.company;

import java.util.List;

public class EmployeesBasket extends StoreBasket implements Payable {
    private int points;

    public EmployeesBasket() {
    }

    public EmployeesBasket(double netAmount, double totalAmount, double vat, List listOfItems, String storeAddress, String cashierName) {
        super(netAmount, totalAmount, vat, listOfItems, storeAddress, cashierName);
    }

    @Override
    public void basketInfo() {
        super.basketInfo();
    }

    @Override
    public void pay() {

    }

    public void calculateBonus() {
        points = (int) (getTotalAmount() / 15);
    }
}
