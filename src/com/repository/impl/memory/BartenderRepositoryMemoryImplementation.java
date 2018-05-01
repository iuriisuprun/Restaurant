package com.repository.impl.memory;

import com.domain.Bartender;
import com.list.BartenderList;
import com.repository.BartenderRepository;

public class BartenderRepositoryMemoryImplementation implements BartenderRepository {

    private BartenderList bartenderList = new BartenderList();

    private static BartenderRepositoryMemoryImplementation instance;

    public static BartenderRepositoryMemoryImplementation getInstance(){
        if (instance == null){
            instance = new BartenderRepositoryMemoryImplementation();
        }
        return instance;
    }


    @Override
    public void addBartender(Bartender bartender) {
        bartenderList.addBartender(bartender);
    }

    @Override
    public void removeBartender(Bartender bartender) {
        bartenderList.removeBartender(bartender);
    }

    @Override
    public BartenderList getAllBartender() {
        return bartenderList;
    }
}
