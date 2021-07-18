import java.io.*;
import java.util.*;

public class Utils {
    public List<String> readStringsFromFile(String path) throws FileNotFoundException {
        List<String> stringsFromFile = new ArrayList<>();
        Scanner sc = new Scanner(new File(path));
        while (sc.hasNextLine()) {
            stringsFromFile.add(sc.nextLine());
        }
        sc.close();
        return stringsFromFile;
    }

    public void writeStringsToFileInReversOrder(String path, List<String> stringsFromFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        for (int i = stringsFromFile.size() - 1; i >= 0; i--) {
            writer.write("\n" + stringsFromFile.get(i));
        }
        writer.close();
    }

    public int readNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    public Stack pushDigitsUpTheStack(int number) {
        Stack st = new Stack();
        while (number != 0) {
            st.push(number % 10);
            number /= 10;
        }
        return st;
    }

    public int getReversNumber(Stack st) {
        int resultNumber;
        String stringNumber = "";
        while (!st.empty()) {
            stringNumber = stringNumber + st.pop();
        }
        stringNumber = new StringBuffer(stringNumber).reverse().toString();
        resultNumber = Integer.parseInt(stringNumber);
        return resultNumber;
    }

    public File[] getDirectoryElements(String directoryPath) {
        File[] directoryFiles = null;
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            directoryFiles = directory.listFiles();
        }
        return directoryFiles;
    }

    public List<String> getPoemSortedByStringLength(List<String> Poem) {
        Collections.sort(Poem, new LineLengthComporator());
        return Poem;
    }

    public boolean checkBrackets(String str) {
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            if (check < 0) {
                return false;
            }
            String symbol = str.substring(i, i + 1);
            if (symbol.equals("(") || symbol.equals("{") || symbol.equals("[")) {
                check++;
            }
            if (symbol.equals(")") || symbol.equals("}") || symbol.equals("]")) {
                check--;
            }
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }

    public HashSet<String> getSetWords(List<String> text) {
        HashSet<String> stringSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        String line = text.get(0);
        for (int i = 0; i < text.size(); i++) {
            line = text.get(i);
            stringBuilder.append(line);
        }
        stringSet.addAll(Arrays.asList(stringBuilder.toString().toLowerCase().split(" |, |. |! |- ")));
        return stringSet;
    }
}

