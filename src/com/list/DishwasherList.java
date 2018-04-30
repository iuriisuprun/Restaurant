package com.list;

import com.domain.Dishwasher;

import java.util.Arrays;

public class DishwasherList {

    private static final int INITIAL_SIZE = 100;
    private int dishwashersLogicSize = 0;

    private Dishwasher[] dishwashers = new Dishwasher[INITIAL_SIZE];

    public void addDishwasher(Dishwasher dishwasher){
        dishwashers[dishwashersLogicSize++] = dishwasher;
    }

    public void addDishwashers(Dishwasher[] dishwashers){
        for (int i = 0; i < dishwashers.length; i++) {
            addDishwasher(dishwashers[i]);
        }
    }

    public void removeDishwasher(Dishwasher dishwasher){
        Dishwasher[] result = new Dishwasher[INITIAL_SIZE];
        int resultIndex = 0;
        for (int i = 0; i < dishwashers.length; i++) {
            if (!dishwasher.equals(dishwasher)){
                result[resultIndex] = dishwashers[i];
            }
        }
        dishwashers = result;
        dishwashersLogicSize = resultIndex;
    }

    public Dishwasher[] getDishwashers() {
        return Arrays.copyOf(dishwashers, dishwashersLogicSize);
    }

    public void setDishwashers(Dishwasher[] dishwashers) {
        dishwashersLogicSize = 0;
    }
}
