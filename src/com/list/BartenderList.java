package com.list;

import com.domain.Bartender;

import java.util.Arrays;

public class BartenderList {

    private final static int INITIAL_SIZE = 100;
    private static int bartenderLogicSize = 0;

    private Bartender[] bartenders = new Bartender[INITIAL_SIZE];

    public void addBartender(Bartender bartender) {
        bartenders[bartenderLogicSize++] = bartender;
    }

    public void addBartenders(Bartender[] bartenders) {
        for (Bartender bartender : bartenders) {
            addBartender(bartender);
        }
    }


    public void removeBartender(Bartender bartender) {
        Bartender[] result = new Bartender[INITIAL_SIZE];
        int resultIndex = 0;
        for (int i = 0; i < bartenderLogicSize; i++) {
            if(!bartenders[i].equals(bartender)){
                result[resultIndex++] = bartenders[i];
            }
        }
        bartenders = result;
        bartenderLogicSize = resultIndex;
    }

    public Bartender[] getBartenders() {
        return Arrays.copyOf(bartenders, bartenderLogicSize);
    }

    public void setBartenders(Bartender[] bartenders) {
        bartenderLogicSize = 0;
        addBartenders(bartenders);
    }

    @Override
    public String toString() {
        return "BartenderList{" +
                "bartenders=" + Arrays.toString(getBartenders()) +
                '}';
    }
}
