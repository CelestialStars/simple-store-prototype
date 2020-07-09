package com.company;
//enum & exception handling
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static boolean isManager = false;
    public static int todayDiscountPercent = 0;

    public static void main(String[] args) {
        StoreBasket storeBasket = new StoreBasket();
        Manager manager = new Manager("Lisa", "Vetka", 00000, "LisVet",
                101010, "Estonia", 65656, 665, 00000);
        Cashier laurence = new Cashier("Laurence", "Mika", 55555, "LauMika",
                11111, "Canada", 12121, 110, 900);
        Cashier dominik = new Cashier("Dominik", "Hergs", 66666, "DomHer",
                22222, "Germany", 23232, 221, 900);
        Cashier eva = new Cashier("Evans", "Rozt", 55555, "Eva",
                3, "Estonia", 32323, 332, 900);
        Cashier raffa = new Cashier("Raffael", "Emelo", 55555, "RaffaEm",
                44444, "Italy", 43434, 443, 900);
        Cashier karim = new Cashier("Karim", "Ahmed", 55555, "KarAh",
                55555, "Egypt", 54545, 554, 900);
        Cashier cashier = new Cashier();
        List<Cashier> cashiers = new ArrayList<>(List.of(laurence, dominik, eva, raffa, karim));
        Runner.storeWelcomeMessage();
        loginMenu(cashier, manager, cashiers);
        selectLanguageRunMenu();
        storeBasket.pay();
        System.out.println("_________________________DONE___________________________");
    }

    public static void loginMenu(Cashier cashier, Manager manager, List<Cashier> cashiers) {
        manager.managerLogging(manager);
        if (isManager) {
            System.out.println("Insert your pin code");
            Scanner scan = new Scanner(System.in);
            int code = scan.nextInt();
            switch (code) {
                case 00000:
                    System.out.println("insert today's discount value");
                    int discountForToday = scan.nextInt();
                    ItemWithDiscount itemWithDiscount = new ItemWithDiscount();
                    itemWithDiscount.setDiscount(discountForToday);
                    System.out.println("insert today's discount independence value");
                    int independence = scan.nextInt();
                    DiscountIndependence discountIndependence = new DiscountIndependence();
                    discountIndependence.setDiscountIndependencevalue(independence);
                    System.out.println("insert today's buy more pay less percentage");
                    double percentage = scan.nextInt();
                    System.out.println("insert no. of bought items");
                    int items = scan.nextInt();
                    BuyMorePayLess buyMorePayLess = new BuyMorePayLess();
                    buyMorePayLess.setPaidItems(items * percentage);
                    System.out.println("insert minimum number to buy for item take it all ");
                    int no = scan.nextInt();
                    ItemTakeItAll itemTakeItAll = new ItemTakeItAll();
                    itemTakeItAll.setMinimumNumberToBuy(no);
                    itemTakeItAll.setDiscount(todayDiscountPercent);
                    break;
                default: 
                    System.out.println("Wrong code.....");
                    break;
            }
        }
        cashier.cashierLogging(cashiers);
    }

    public static void selectLanguageRunMenu() {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a language");
        System.out.println(" insert 1 for English or 2 Estonian");
        int choice = input.nextInt();
        switch (choice) {

            case 1:
                Locale.setDefault(new Locale("en", "US"));
                menu.basketChoice();
                menu.runMenu();
                break;
            case 2:
                Locale.setDefault(new Locale("et", "EE"));
                menu.basketChoice();
                menu.runMenu();
                break;
            default:
                System.out.println("No action taken, try again!!!");
                selectLanguageRunMenu();
        }
    }

    private static void storeWelcomeMessage() {
        System.out.println("+-----------------------------------+");
        System.out.println("  Welcome to the store application, we are happy to see you!  ");
        System.out.println("+-----------------------------------+");
    }
}
