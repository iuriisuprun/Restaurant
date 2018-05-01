package com.service;

import com.domain.Dishwasher;
import com.list.DishwasherList;
import com.repository.DishwasherRepository;
import com.repository.impl.memory.DishwasherRepositoryMemoryImplementation;

import java.util.Arrays;

public class DishwasherService {

    private DishwasherRepository dishwasherRepository;

    public DishwasherService() {
        dishwasherRepository = DishwasherRepositoryMemoryImplementation.getInstance();
    }

    public void addDishwasher(Dishwasher dishwasher){
        dishwasherRepository.addDishwasher(dishwasher);
    }

    public void removeDishwasher(Dishwasher dishwasher){
        dishwasherRepository.removeDishwasher(dishwasher);
    }

    public DishwasherList getAllDishwashers(){
        return dishwasherRepository.getAllDishwashers();
    }

    public void sortDishwashersByExperience(DishwasherList dishwasherList){
        Dishwasher[] result = dishwasherList.getDishwashers();
        Arrays.sort(result);
        dishwasherList.setDishwashers(result);
    }

    public void printDishwashers(DishwasherList dishwasherList){
        for (Dishwasher dishwasher : dishwasherList.getDishwashers()) {
            System.out.println(dishwasher);
        }
    }
}
