package com.example.demo;
//This is Dollar Class
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times( int multiplier) {
        return new Dollar(amount * multiplier);
    }
}