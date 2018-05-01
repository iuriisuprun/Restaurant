package com.domain;

public class Waiter extends Human{

    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Waiter waiter = (Waiter) o;

        return experience == waiter.experience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + experience;
        return result;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}
