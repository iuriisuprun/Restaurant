package com.domain;

public class Waiter extends Human{

    private int experience;

    @Override
    public String toString() {
        return "Waiter{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}
