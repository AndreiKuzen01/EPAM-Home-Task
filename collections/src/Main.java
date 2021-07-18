import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Utils util = new Utils();

        // 1.   Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
        String filePath = "f:/Andrei/collection.txt";
        List<String> stringsFromFile = new ArrayList<>();
        try {
            stringsFromFile = util.readStringsFromFile(filePath);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        }
        try {
            util.writeStringsToFileInReversOrder(filePath, stringsFromFile);
        } catch (IOException ex) {
            System.out.println("Файл не найден!");
        }

        // 2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
        System.out.println("Введите число");
        Stack stack = util.pushDigitsUpTheStack(util.readNumber());
        int reversNumber = util.getReversNumber(stack);
        System.out.println("Число с цифрами в обратном порядке = " + reversNumber);


        // 3. Создать список из элементов каталога и его подкаталогов.
        String directoryPath = "f:/Andrei/";
        File[] directoryFiles = util.getDirectoryElements(directoryPath);
        for (int i = 0; i < directoryFiles.length; i++) {
            System.out.println(directoryFiles[i].getName());
        }

        // 4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
        String poemPath = "f:/Andrei/poem.txt";
        List<String> poem = new ArrayList<>();
        try {
            poem = util.readStringsFromFile(poemPath);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        }
        try {
            util.writeStringsToFileInReversOrder(poemPath, util.getPoemSortedByStringLength(poem));
        } catch (IOException ex) {
            System.out.println("Файл не найден!");
        }

        //5. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
        int listSize = 10;
        int minNumber = -10;
        int maxNumber = 10;
        List<Integer> numbers = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            int randomNumber = (int) (Math.random() * (maxNumber - minNumber + 1)) - maxNumber;
            numbers.add(randomNumber);
        }
        for (int i = 0; i < listSize; i++) {
            if (numbers.get(i) >= 0) {
                numbers.add((numbers.get(i)));
                numbers.remove(i);
            }
        }
        for (int i = 0; i < listSize; i++) {
            if (numbers.get(i) < 0) {
                numbers.add(numbers.get(i));
                numbers.remove(i);
            }
        }
        System.out.println(numbers);

        // 6. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
        String path = "f:/Andrei/collection2.txt";
        List<String> unsortStringsFromFile = new ArrayList<>();
        try {
            unsortStringsFromFile = util.readStringsFromFile(path);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        }
        Collections.sort(unsortStringsFromFile);
        for (int i = 0; i < unsortStringsFromFile.size(); i++) {
            System.out.println(unsortStringsFromFile.get(i));
        }

        // 7. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок. Использовать стек.
        String brackets = "(),[],{}";
        System.out.println(util.checkBrackets(brackets));

        // 8. Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.
        String englishTextPath = "f:/Andrei/collection3.txt";
        try {
            System.out.println(util.getSetWords(util.readStringsFromFile(englishTextPath)));
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        }

    }
}

