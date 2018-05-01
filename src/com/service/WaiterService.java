package com.service;

import com.domain.Waiter;
import com.list.WaiterList;
import com.repository.WaiterRepository;
import com.repository.impl.memory.WaiterRepositoryMemoryImplementation;

import java.util.Arrays;

public class WaiterService {

    private WaiterRepository waiterRepository;

    public WaiterService() {
        waiterRepository = WaiterRepositoryMemoryImplementation.getInstance();
    }

    public void addWaiter(Waiter waiter){
        waiterRepository.addWaiter(waiter);
    }

    public void removeWaiter(Waiter waiter){
        waiterRepository.removeWaiter(waiter);
    }

    public WaiterList getAllWaiters(){
        return waiterRepository.getAllWaiters();
    }

    public void sortWaitersByExperience(WaiterList waiterList){
        Waiter[] result = waiterList.getWaiters();
        Arrays.sort(result);
        waiterList.setWaiters(result);
    }

    public void printWaiters(WaiterList waiterList){
        for (Waiter waiter : waiterList.getWaiters()) {
            System.out.println(waiter);
        }
    }
}
