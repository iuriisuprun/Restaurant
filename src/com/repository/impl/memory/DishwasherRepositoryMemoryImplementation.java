package com.repository.impl.memory;

import com.domain.Dishwasher;
import com.list.DishwasherList;
import com.repository.DishwasherRepository;

public class DishwasherRepositoryMemoryImplementation implements DishwasherRepository{

    private DishwasherList dishwasherList = new DishwasherList();

    private static DishwasherRepositoryMemoryImplementation instance;

    public DishwasherRepositoryMemoryImplementation() {
    }

    public static DishwasherRepositoryMemoryImplementation getInstance(){
        if (instance == null){
            instance = new DishwasherRepositoryMemoryImplementation();
        }
        return instance;
    }

    @Override
    public void addDishwasher(Dishwasher dishwasher) {
        dishwasherList.addDishwasher(dishwasher);
    }

    @Override
    public void removeDishwasher(Dishwasher dishwasher) {
        dishwasherList.removeDishwasher(dishwasher);
    }

    @Override
    public DishwasherList getAllDishwashers() {
        return dishwasherList;
    }
}
