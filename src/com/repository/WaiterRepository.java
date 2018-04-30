package com.repository;

import com.domain.Waiter;
import com.list.WaiterList;

public interface WaiterRepository {

    void addWaiter(Waiter waiter);
    void removeWaiter(Waiter waiter);
    WaiterList getAllWaiters();
}
