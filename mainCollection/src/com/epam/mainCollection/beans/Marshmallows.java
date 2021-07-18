package com.epam.mainCollection.beans;

public class Marshmallows extends Sweet {
    private String color;

    public Marshmallows(String name, int weight, boolean containsNuts, String manufacture, int sugarContent, boolean containsChocolate, String color) {
        this.color = color;
        setName(name);
        setWeight(weight);
        setContainsNuts(containsNuts);
        setManufacture(manufacture);
        setSugarContent(sugarContent);
        setContainsChocolate(containsChocolate);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Marshmallows{" + super.toString() +
                "color = " + color + "}";
    }
}
