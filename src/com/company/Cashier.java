package com.company;

import java.util.List;
import java.util.Scanner;

public class Cashier extends User {
    private int internalPhoneNumber;
    private double baseSalary;
    private double hoursOfWork;

    public Cashier() {
    }
    public Cashier(String name, String surname, int id, String username, int password, String address, int phoneNumber, int internalPhoneNumber, double baseSalary) {
        super(name, surname, id, username, password, address, phoneNumber);
        this.internalPhoneNumber = internalPhoneNumber;
        this.baseSalary = baseSalary;
    }


    public int getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getHoursOfWork() {
        return hoursOfWork;
    }

    public void cashierLogging(List<Cashier> cashiers) {
        try {
        System.out.println("Are you a cashier 'Y' or 'N'");
        Scanner answer = new Scanner(System.in);
        String ans = answer.nextLine();
        int i = 0;
        switch (ans.toLowerCase()) {
            case "n":
                System.out.println("Cashier login credentials are needed, sorry");
                cashierLogging(cashiers);
                break;
            default:
                Scanner input = new Scanner(System.in);
                System.out.println("Insert your username");
                String username = input.nextLine();
                System.out.println("Insert your password");
                int password = input.nextInt();
                for (Cashier cashier : cashiers) {
                    i++;
                    if (username.equals(cashier.getUsername()) && password == cashier.getPassword()) {
                        System.out.println("Logged in!");
                        break;
                    }
                }
                break;
        }
        if (i == cashiers.size()) {
            cashierLogging(cashiers);
        }
    } catch (Exception exception){
            exception.printStackTrace();
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", password=" + getPassword() +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                ", internalPhoneNumber=" + internalPhoneNumber +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
