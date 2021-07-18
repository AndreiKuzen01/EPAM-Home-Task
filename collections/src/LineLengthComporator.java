import java.util.Comparator;

public class LineLengthComporator implements Comparator<String> {

    @Override
    public int compare (String a, String b){
        return b.length() - a.length();
    }
}
