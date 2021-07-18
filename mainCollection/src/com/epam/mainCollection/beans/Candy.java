package com.epam.mainCollection.beans;

public class Candy extends Sweet {
    private boolean containsNougat;

    public Candy(String name, int weight, boolean containsNuts, String manufacture, int sugarContent, boolean containsChocolate, boolean containsNougat){
        setName(name);
        setWeight(weight);
        setContainsNuts(containsNuts);
        setManufacture(manufacture);
        setSugarContent(sugarContent);
        setContainsChocolate(containsChocolate);
        this.containsNougat = containsNougat;
    }

    public boolean isContainsNougat() {
        return containsNougat;
    }

    public void setContainsNougat(boolean containsNougat) {
        this.containsNougat = containsNougat;
    }

    @Override
    public String toString() {
        return "Candy{" + super.toString() + "containsNougat = " + containsNougat + "}";

    }
}
