package com;

import com.domain.Restaurant;
import com.domain.Waiter;
import com.list.WaiterList;
import com.repository.WaiterRepository;
import com.repository.impl.memory.WaiterRepositoryMemoryImplementation;

public class Main {

    public static void main(String[] args) {

        /*WaiterList waiterList = new WaiterList();
        System.out.println(waiterList);
        waiterList.addWaiter(new Waiter());
        System.out.println(waiterList);
        waiterList.removeWaiter(new Waiter());
        System.out.println(waiterList);*/

        WaiterRepository repository = WaiterRepositoryMemoryImplementation.getInstance();
        repository.addWaiter(new Waiter());
        repository.addWaiter(new Waiter());
        repository.addWaiter(new Waiter());

        System.out.println(repository.getAllWaiters());
    }
}
