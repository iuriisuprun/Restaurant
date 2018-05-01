package com.domain;

public class Dishwasher extends Human{

    private int workHours;

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Dishwasher{" +
                "workHours=" + workHours +
                "} " + super.toString();
    }
}
