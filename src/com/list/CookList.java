package com.list;

import com.domain.Cook;

import java.util.Arrays;

public class CookList {

    private final static int INITIAL_SIZE = 100;
    private  int cookLogicSize = 0;

    private Cook[] cooks = new Cook[INITIAL_SIZE];

    public void addCook(Cook cook){
        cooks[cookLogicSize++] = cook;
    }

    public void addCooks(Cook[] cooks){
        for (int i = 0; i <cooks.length ; i++) {
            addCook(cooks[i]);
        }
    }

    public void removeCook(Cook cook) {
        Cook[] result = new Cook[INITIAL_SIZE];
        int resultIndex = 0;
        for (int i = 0; i < cookLogicSize; i++) {
            if(!cooks[i].equals(cook)){
                result[resultIndex++] = cooks[i];
            }
        }
        cooks = result;
        cookLogicSize = resultIndex;
    }

    public Cook[] getCooks() {
        return Arrays.copyOf(cooks, cookLogicSize);
    }

    public void setCooks(Cook[] cooks) {
        cookLogicSize = 0;
        addCooks(cooks);
    }


    @Override
    public String toString() {
        return "CookList{" +
                "cooks=" + Arrays.toString(getCooks()) +
                '}';
    }
}
