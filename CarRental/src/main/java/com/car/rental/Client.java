package com.car.rental;

public class Client {
    public String name;
    public Active loyaltyProgram;

    public Client(String name, Active loyaltyProgram) {
        this.name = name;
        this.loyaltyProgram = loyaltyProgram;
    }
}