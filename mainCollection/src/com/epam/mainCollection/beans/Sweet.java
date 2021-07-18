package com.epam.mainCollection.beans;

public abstract class Sweet {
    private String name;
    private int weight;
    private boolean containsNuts;
    private String manufacture;
    private int sugarContent;
    private boolean containsChocolate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public boolean isContainsChocolate() {
        return containsChocolate;
    }

    public void setContainsChocolate(boolean containsChocolate) {
        this.containsChocolate = containsChocolate;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", weight = " + weight +
                ", containsNuts = " + containsNuts +
                ", manufacture = " + manufacture +
                ", sugarContent = " + sugarContent +
                ", containsChocolate = " + containsChocolate ;
    }
}
