package com.epam.mainCollection.comporator;

import com.epam.mainCollection.beans.Sweet;

import java.awt.*;
import java.util.Comparator;

public class SweetComporator implements Comparator<Sweet> {

    @Override
    public int compare (Sweet o1, Sweet o2){
        return o1.getWeight() - o2.getWeight();
    }
}
