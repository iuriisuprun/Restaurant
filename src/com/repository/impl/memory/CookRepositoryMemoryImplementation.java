package com.repository.impl.memory;

import com.domain.Cook;
import com.list.CookList;
import com.repository.CookRepository;

public class CookRepositoryMemoryImplementation implements CookRepository {
    private CookList cookList = new CookList();

    private static CookRepositoryMemoryImplementation instance;

    public static CookRepositoryMemoryImplementation getInstance() {
        if (instance == null) {
            instance = new CookRepositoryMemoryImplementation();
        }
        return instance;
    }

    @Override
    public void addCook(Cook cook) {
        cookList.addCook(cook);
    }

    @Override
    public void removeCook(Cook cook) {
        cookList.removeCook(cook);
    }

    @Override
    public CookList getAllCooks() {
        return cookList;
    }
}
