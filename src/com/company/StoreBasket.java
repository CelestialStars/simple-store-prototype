package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreBasket implements Payable {
    private static int id = 0;
    private double netAmount;
    private double totalAmount;
    private double vat = 0.20;
    private List listOfItems = new ArrayList();
    private LocalDateTime dateTimeOfPurchase = LocalDateTime.now();
    private String storeAddress = "Ulemiste, Tallinn";
    private String cashierName;

    public StoreBasket() {
    }

    public StoreBasket(double netAmount, double totalAmount, double vat, List listOfItems, String storeAddress, String cashierName) {
        this.netAmount = netAmount;
        this.totalAmount = totalAmount;
        this.vat = vat;
        this.listOfItems = listOfItems;
        this.dateTimeOfPurchase = dateTimeOfPurchase.now();
        this.storeAddress = storeAddress;
        this.cashierName = cashierName;
        id++;
    }

    public static int getId() {
        return id;
    }


    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getVat() {
        return 0.20;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public List getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List listOfItems) {
        this.listOfItems = listOfItems;
    }

    public LocalDateTime getDateAndTimeOfPurchase() {
        return dateTimeOfPurchase;
    }


    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public void basketInfo() {
        System.out.println("StoreBasket{" +
                ", id=" + id +
                "netAmount=" + netAmount +
                ", totalAmount=" + totalAmount +
                ", vat=" + vat +
                ", listOfItems=" + listOfItems +
                ", dateAndTimeOfPurchase='" + dateTimeOfPurchase + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", cashierName='" + cashierName + '\'' +
                '}');
    }

    @Override
    public void pay() {
        System.out.println(" Please confirm the amount is to be paid is: " + totalAmount);
        System.out.println("Press 1 to confirm...");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Thanks, payment is done!");
                break;
            default:
                System.out.println("Something went wrong...");
                pay();
                break;
        }
    }
}
