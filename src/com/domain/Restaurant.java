package com.domain;

import com.list.BartenderList;
import com.list.CookList;
import com.list.DishwasherList;
import com.list.WaiterList;

public class Restaurant {

    private String name;
    private String city;
    private int yearOfFound;
    private double area;
    private Owner owner;
    private Manager manager;
    private WaiterList waiterList;
    private Chef chef;
    private CookList cookList;
    private BartenderList bartenderList;
    private DishwasherList dishwasherList;

    public Restaurant() {
    }

    public Restaurant(String name, String city, int yearOfFound,
                      double area, Owner owner, Manager manager,
                      WaiterList waiterList, Chef chef, CookList cookList,
                      BartenderList bartenderList, DishwasherList dishwasherList) {
        this.name = name;
        this.city = city;
        this.yearOfFound = yearOfFound;
        this.area = area;
        this.owner = owner;
        this.manager = manager;
        this.waiterList = waiterList;
        this.chef = chef;
        this.cookList = cookList;
        this.bartenderList = bartenderList;
        this.dishwasherList = dishwasherList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfFound() {
        return yearOfFound;
    }

    public void setYearOfFound(int yearOfFound) {
        this.yearOfFound = yearOfFound;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public WaiterList getWaiterList() {
        return waiterList;
    }

    public void setWaiterList(WaiterList waiterList) {
        this.waiterList = waiterList;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public CookList getCookList() {
        return cookList;
    }

    public void setCookList(CookList cookList) {
        this.cookList = cookList;
    }

    public BartenderList getBartenderList() {
        return bartenderList;
    }

    public void setBartenderList(BartenderList bartenderList) {
        this.bartenderList = bartenderList;
    }

    public DishwasherList getDishwasherList() {
        return dishwasherList;
    }

    public void setDishwasherList(DishwasherList dishwasherList) {
        this.dishwasherList = dishwasherList;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", yearOfFound=" + yearOfFound +
                ", area=" + area +
                ", owner=" + owner +
                ", manager=" + manager +
                ", waiterList=" + waiterList +
                ", chef=" + chef +
                ", cookList=" + cookList +
                ", bartenderList=" + bartenderList +
                ", dishwasherList=" + dishwasherList +
                '}';
    }
}
