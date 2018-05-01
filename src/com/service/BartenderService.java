package com.service;

import com.domain.Bartender;
import com.list.BartenderList;
import com.repository.BartenderRepository;
import com.repository.impl.memory.BartenderRepositoryMemoryImplementation;

public class BartenderService {
    private BartenderRepository bartenderRepository;

    public BartenderService() {
        bartenderRepository = BartenderRepositoryMemoryImplementation.getInstance();
    }


    public void addBartender(Bartender bartender) {
        bartenderRepository.addBartender(bartender);
    }

    public void removeBartender(Bartender bartender) {
        bartenderRepository.removeBartender(bartender);
    }

    public BartenderList getAllBartenders() {
        return bartenderRepository.getAllBartender();
    }

    public void printBartenders(BartenderList bartenderList) {
        for (Bartender bartender : bartenderList.getBartenders()) {
            System.out.println(bartender);
        }
    }
}
