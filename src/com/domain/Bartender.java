package com.domain;

public class Bartender extends Human {

    private int quantityMadeCocktails;

    public int getQuantityMadeCocktails() {
        return quantityMadeCocktails;
    }

    public void setQuantityMadeCocktails(int quantityMadeCocktails) {
        this.quantityMadeCocktails = quantityMadeCocktails;
    }

    @Override
    public String toString() {
        return "Bartender{" +
                "quantityMadeCocktails=" + quantityMadeCocktails +
                '}' + super.toString();
    }
}