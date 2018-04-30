package com.list;

import com.domain.Waiter;

import java.util.Arrays;

public class WaiterList {

    private static final int INITIAL_SIZE = 100;
    private int waitersLogicSize = 0;

    private Waiter[] waiters = new Waiter[INITIAL_SIZE];

    public void addWaiter(Waiter waiter){
        waiters[waitersLogicSize++] = waiter;
    }

    public void addWaiters(Waiter[] waiters){
        for (int i = 0; i < waiters.length; i++) {
            addWaiter(waiters[i]);
        }
    }

    public void removeWaiter(Waiter waiter){
        Waiter[] result = new Waiter[INITIAL_SIZE];
        int resultIndex = 0;
        for (int i = 0; i < waitersLogicSize; i++) {
            if (!waiters[i].equals(waiter)) {
                result[resultIndex++] = waiters[i];
            }
        }
        waiters = result;
        waitersLogicSize = resultIndex;
    }

    public Waiter[] getWaiters() {
        return Arrays.copyOf(waiters, waitersLogicSize);
    }

    public void setWaiters(Waiter[] waiters) {
        waitersLogicSize = 0;
        addWaiters(waiters);
    }

    @Override
    public String toString() {
        return Arrays.toString(getWaiters());
    }
}
