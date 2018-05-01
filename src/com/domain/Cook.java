package com.domain;

public class Cook extends Human {

    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}