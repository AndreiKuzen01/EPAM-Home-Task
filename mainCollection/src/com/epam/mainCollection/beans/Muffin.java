package com.epam.mainCollection.beans;

public class Muffin extends Sweet {
    private boolean containsRaisins;

    public Muffin(String name, int weight, boolean containsNuts, String manufacture, int sugarContent, boolean containsChocolate, boolean containsRaisins) {
        this.containsRaisins = containsRaisins;
        setName(name);
        setWeight(weight);
        setContainsNuts(containsNuts);
        setManufacture(manufacture);
        setSugarContent(sugarContent);
        setContainsChocolate(containsChocolate);
    }

    public boolean isContainsRaisius() {
        return containsRaisins;
    }

    public void setContainsRaisius(boolean containsRaisins) {
        this.containsRaisins = containsRaisins;
    }

    @Override
    public String toString() {
        return "Muffin{" + super.toString() + "containsRaisins = " + containsRaisins + "}";
    }
}
