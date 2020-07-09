package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Menu {
    ResourceBundle menuBundle = ResourceBundle.getBundle("StoreBundle");
    static int choice;
    List<Item> basketItems = new ArrayList();

    public void basketChoice() {
        ResourceBundle menuBundle = ResourceBundle.getBundle("StoreBundle");
        Scanner input = new Scanner(System.in);
        System.out.println(menuBundle.getString("BasketChoice"));
        int cho = input.nextInt();
        choice = cho;
    }

    public void runMenu() {
        ResourceBundle menuBundle = ResourceBundle.getBundle("StoreBundle");
        switch (choice) {
            case 0:
                System.out.println(menuBundle.getString("Message"));
                System.out.println("1- " + menuBundle.getString("AddItem") + "\n" +
                        "2- " + menuBundle.getString("RemoveItem") + "\n" +
                        "3- " + menuBundle.getString("ShowBasketInfo") + "\n" +
                        "4- " + menuBundle.getString("ChristmasDiscount") + "\n" +
                        "5- " + menuBundle.getString("Quit"));
                Scanner input = new Scanner(System.in);
                int ans = input.nextInt();
                switch (ans) {
                    case 1:
                        System.out.println("Insert item name");
                        String itemName = input.nextLine();
                        input.nextLine();
                        System.out.println("Insert item price");
                        String price = input.nextLine();
                        Item theItem = new Item(itemName, Double.parseDouble(price));
                        basketItems.add(theItem);
                        runMenu();
                        break;
                    case 2:
                        System.out.println("Insert the id of the Item you want to remove");
                        int id = input.nextInt();
                        //basketItems.remove(id);
                        System.out.println("Item has been removed");
                        runMenu();
                        break;
                    case 3:
                        StoreBasket storeBasket = new StoreBasket();
                        storeBasket.setListOfItems(basketItems);
                        double netAmount = basketItems.stream().mapToDouble(i -> i.getPrice()).sum();
                        storeBasket.setNetAmount(netAmount);
                        storeBasket.setTotalAmount(netAmount * 1.2);
                        storeBasket.setCashierName(Cashier.class.getName());
                        storeBasket.basketInfo();
                        runMenu();
                        break;
                    case 4:
                        double total = basketItems.stream().mapToDouble(i -> i.getPrice()).sum();
                        double totalAfterPromo = 1.2 * 0.9 * total;
                        System.out.println("Total after applying christmas promo is " + totalAfterPromo);
                        runMenu();
                        break;
                    case 5:
                        System.out.println("Logged Out ");
                        break;
                }
                break;
            case 1:
                System.out.println(menuBundle.getString("Message"));
                System.out.println("1- " + menuBundle.getString("AddItem") + "\n" +
                        "2- " + menuBundle.getString("RemoveItem") + "\n" +
                        "3- " + menuBundle.getString("ShowBasketInfo") + "\n" +
                        "4- " + menuBundle.getString("ChristmasDiscount") + "\n" +
                        "5- " + menuBundle.getString("Quit"));
                Scanner inputt = new Scanner(System.in);
                int anss = inputt.nextInt();
                switch (anss) {
                    case 1:
                        System.out.println("Insert item name");
                        String itemName = inputt.nextLine();
                        inputt.nextLine();
                        System.out.println("Insert item price");
                        String price = inputt.nextLine();
                        Item theItem = new Item(itemName, Double.parseDouble(price));
                        basketItems.add(theItem);
                        runMenu();
                        break;
                    case 2:
                        System.out.println("Insert the id of the Item you want to remove");
                        int id = inputt.nextInt();
                        //basketItems.remove(id);
                        System.out.println("Item removed");
                        runMenu();
                        break;
                    case 3:
                        StoreBasket storeBasket = new LoyaltyBasket();
                        storeBasket.setListOfItems(basketItems);
                        double netAmount = basketItems.stream().mapToDouble(i -> i.getPrice()).sum();
                        storeBasket.setNetAmount(netAmount);
                        storeBasket.setTotalAmount(netAmount * 1.2);
                        storeBasket.setCashierName(Cashier.class.getName());
                        storeBasket.basketInfo();
                        runMenu();
                        break;
                    case 4:
                        double total = basketItems.stream().mapToDouble(i -> i.getPrice()).sum();
                        double totalAfterPromo = 1.2 * 0.9 * total;
                        System.out.println("Total after applying christmas promo is " + totalAfterPromo);
                        runMenu();
                        break;
                    case 5:
                        System.out.println("Logged Out ");
                        break;
                }
                break;
            case 2:
                System.out.println(menuBundle.getString("Message"));
                System.out.println("1- " + menuBundle.getString("AddItem") + "\n" +
                        "2- " + menuBundle.getString("RemoveItem") + "\n" +
                        "3- " + menuBundle.getString("ShowBasketInfo") + "\n" +
                        "4- " + menuBundle.getString("ChristmasDiscount") + "\n" +
                        "5- " + menuBundle.getString("Quit"));
                Scanner inputtt = new Scanner(System.in);
                int ansss = inputtt.nextInt();
                switch (ansss) {
                    case 1:
                        System.out.println("Insert item name");
                        String itemName = inputtt.nextLine();
                        inputtt.nextLine();
                        System.out.println("Insert item price");
                        String price = inputtt.nextLine();
                        Item theItem = new Item(itemName, Double.parseDouble(price));
                        basketItems.add(theItem);
                        runMenu();
                        break;
                    case 2:
                        System.out.println("Insert the id of the Item you want to remove");
                        int id = inputtt.nextInt();
                        //basketItems.remove(id);
                        System.out.println("Item removed");
                        runMenu();
                        break;
                    case 3:
                        StoreBasket storeBasket = new EmployeesBasket();
                        storeBasket.setListOfItems(basketItems);
                        double netAmount = basketItems.stream().mapToDouble(i -> i.getPrice()).sum();
                        storeBasket.setNetAmount(netAmount);
                        storeBasket.setTotalAmount(netAmount * 1.2);
                        storeBasket.setCashierName(Cashier.class.getName());
                        storeBasket.basketInfo();
                        runMenu();
                        break;
                    case 4:
                        double total = basketItems.stream().mapToDouble(i -> i.getPrice()).sum();
                        double totalAfterPromo = 1.2 * 0.9 * total;
                        System.out.println("Total after applying christmas promo is " + totalAfterPromo);
                        runMenu();
                        break;
                    case 5:
                        System.out.println("Logged Out ");
                        break;
                }
                break;
        }
    }
}
