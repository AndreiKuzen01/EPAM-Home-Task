package com.epam.mainCollection.utils;

        import com.epam.mainCollection.beans.Sweet;

        import java.util.List;

public interface IUtils {
    public List <Sweet> findBySugarContent(List<Sweet> gift, int fromSugarContent, int toSugarContent);

    public void sortSweets (List <Sweet> sweetList);

}
