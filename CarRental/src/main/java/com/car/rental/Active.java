package com.car.rental;

public enum Active {
    NO(0),
    YES(1);

    private int val;

    Active(int val) {
        this.val = val;
    }

    public int getVal(){
        return val;
    }
}
