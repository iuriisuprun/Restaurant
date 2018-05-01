package com.repository;

import com.domain.Dishwasher;
import com.list.DishwasherList;

public interface DishwasherRepository {

    void addDishwasher(Dishwasher dishwasher);
    void removeDishwasher(Dishwasher dishwasher);
    DishwasherList getAllDishwashers();
}
