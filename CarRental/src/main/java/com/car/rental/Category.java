package com.car.rental;

public enum Category {
    None(0),
    A(1),
    B(2),
    D(3);

    private int val;

    Category(int val) {
        this.val = val;
    }

    public int getVal(){
        return val;
    }
}
