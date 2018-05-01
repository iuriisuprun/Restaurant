package com.repository;

import com.domain.Bartender;
import com.list.BartenderList;

public interface BartenderRepository {
    void addBartender(Bartender bartender);
    void removeBartender(Bartender bartender);
    BartenderList getAllBartender();
}
