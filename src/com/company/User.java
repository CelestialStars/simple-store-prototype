package com.company;

public class User {
    private  String name;
    private  String surname;
    private  int id;
    private  String username;
    private  int password;
    private  String address;
    private  int phoneNumber;

    public User(String name, String surname, int id, String username, int password, String address, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
