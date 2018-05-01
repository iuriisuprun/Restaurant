package com.repository;

import com.domain.Cook;
import com.list.CookList;

public interface CookRepository {
    void addCook(Cook cook);
    void removeCook(Cook cook);
    CookList getAllCooks();
}
