package com.repository.impl.memory;

import com.domain.Waiter;
import com.list.WaiterList;
import com.repository.WaiterRepository;

public class WaiterRepositoryMemoryImplementation implements WaiterRepository{

    private WaiterList waiterList = new WaiterList();

    private static WaiterRepositoryMemoryImplementation instance;

    public WaiterRepositoryMemoryImplementation() {
    }

    public static WaiterRepositoryMemoryImplementation getInstance(){
        if (instance == null){
            instance = new WaiterRepositoryMemoryImplementation();
        }
        return instance;
    }

    @Override
    public void addWaiter(Waiter waiter) {
        waiterList.addWaiter(waiter);
    }

    @Override
    public void removeWaiter(Waiter waiter) {
        waiterList.removeWaiter(waiter);
    }

    @Override
    public WaiterList getAllWaiters() {
        return waiterList;
    }
}
