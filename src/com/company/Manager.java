package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Manager extends User {
    private final int internalPhoneNumber;
    private final int pin;
    private LocalDateTime loginTime;

    public Manager(String name, String surname, int id, String username, int password, String address, int phoneNumber, int internalPhoneNumber, int pin) {
        super(name, surname, id, username, password, address, phoneNumber);
        this.internalPhoneNumber = internalPhoneNumber;
        this.pin = pin;
    }

    public int getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public int getPin() {
        return pin;
    }

    public double calculateDiscount(double theDiscount) {
        return theDiscount;
    }


        public void managerLogging(Manager manager) {
            try {
        System.out.println("Are you a manager y or n");
        Scanner answer = new Scanner(System.in);
        String ans = answer.nextLine();
        switch (ans) {
            case "n":
                break;
            default:
                Scanner input = new Scanner(System.in);
                System.out.println("insert your username");
                String username = input.nextLine();
                System.out.println("insert your password");
                int password = input.nextInt();
                if (username.equals(manager.getUsername()) && (password == manager.getPassword())) {
                    Runner.isManager = true;
                    loginTime = LocalDateTime.now();
                    System.out.println("logging is successful at " + loginTime);
                    break;
                } else {
                    System.out.println("Manager login failed");
                    break;
                }

        }
    } catch (Exception exception){
                exception.printStackTrace();
                System.out.println("Enter valid inputs, either characters for usernames or digits for passwords and pins!");
            }
    }


    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", password=" + getPassword() +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                ", internalPhoneNumber=" + internalPhoneNumber +
                ", pin=" + pin +
                '}';
    }
}
