package com.company;

public class Item {
    private String name;
    private double price;
    private static int id = 0;
    double discount = 0;

    public Item() {
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        id++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setId(int id) {
        Item.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo(Item item) {
        System.out.println(item);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", discount=" + discount +
                '}';
    }
}
