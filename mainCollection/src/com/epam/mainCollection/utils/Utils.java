package com.epam.mainCollection.utils;

        import com.epam.mainCollection.beans.Sweet;
        import com.epam.mainCollection.comporator.SweetComporator;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class Utils implements IUtils {
    public List<Sweet> findBySugarContent(List<Sweet> gift, int fromSugarContent, int toSugarContent){
        List<Sweet> result = new ArrayList<>();

        for (Sweet sweet : gift){
            if (sweet.getSugarContent() >= fromSugarContent && sweet.getSugarContent() <= toSugarContent){
                result.add(sweet);
            }
        }
        return result;
    }

    public void sortSweets(List<Sweet> sweetList){
        Collections.sort(sweetList, new SweetComporator());
    }

    public int getWeight (List<Sweet>gift){
        int weight = 0;
        for (Sweet sweet : gift){
           weight += sweet.getWeight();
        }
        return weight;
    }
}
