package com.epam.mainCollection.main;

import com.epam.mainCollection.beans.Candy;
import com.epam.mainCollection.beans.Marshmallows;
import com.epam.mainCollection.beans.Muffin;
import com.epam.mainCollection.beans.Sweet;
import com.epam.mainCollection.utils.IUtils;
import com.epam.mainCollection.utils.Utils;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sweet candy1 = new Candy("Snikers", 90, true, "USA", 40, true, true);
        Sweet candy2 = new Candy("Chupa Chups", 10, false, "Spain", 7, false, false);
        Sweet candy3 = new Candy("Коровка", 15, false, "Russia", 12, false, false);

        Sweet marshmalows1 = new Marshmallows("Воздушный", 20, false, "Russia", 15, false, "Pinc");
        Sweet marshmalows2 = new Marshmallows("Maxmallows", 15, false, "USA", 12, false, "White");
        Sweet marshmalows3 = new Marshmallows("Чаровей", 150, false, "Belarus", 125, true, "White" );

        Sweet muffin1 = new Muffin("Шоколадный", 45, true, "Belarus", 23, true, false);
        Sweet muffin2 = new Muffin("Столичный", 55, false, "Russia", 27, false, true);
        Sweet muffin3 = new Muffin("Сказочный", 35, true, "Belarus", 13, true, true);

        List<Sweet> gift = new ArrayList<>();

        gift.add(candy1);
        gift.add(candy2);
        gift.add(candy3);

        gift.add(marshmalows1);
        gift.add(marshmalows2);
        gift.add(marshmalows3);

        gift.add(muffin1);
        gift.add(muffin2);
        gift.add(muffin3);

        System.out.println("------ Find by sugar content -----");
        IUtils util = new Utils();
        List <Sweet> result = util.findBySugarContent(gift,10, 20);
        for(Sweet sweet : result){
            System.out.println(sweet);
        }

        System.out.println("----- Sort result -----");
        util.sortSweets(gift);
        for (Sweet sweet : gift){
            System.out.println(sweet);
        }

        System.out.println("Gifts weight = " + ((Utils) util).getWeight(gift));
    }
}
