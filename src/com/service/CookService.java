package com.service;

import com.domain.Cook;
import com.list.CookList;
import com.repository.CookRepository;
import com.repository.impl.memory.CookRepositoryMemoryImplementation;

public class CookService {
    private CookRepository cookRepository;

    public CookService() {
        cookRepository = CookRepositoryMemoryImplementation.getInstance();
    }

    public void addCook(Cook cook) {
        cookRepository.addCook(cook);
    }

    public void removeCook(Cook cook) {
        cookRepository.removeCook(cook);
    }

    public CookList getAllCooks() {
        return cookRepository.getAllCooks();
    }

    public void printCooks(CookList cookList) {
        for (Cook cook : cookList.getCooks()) {
            System.out.println(cook);
        }
    }


}
