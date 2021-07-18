import java.util.*;

public class Utils {

    public HashSet<Integer> findShotestNumber(int[] numbers) {
        HashSet<Integer> result = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int lengthShotestNumber = findShotestLength(numbers);
            if ((numbers[i] + "").length() == lengthShotestNumber) {
                result.add(numbers[i]);
            }
        }
        return result;
    }

    public HashSet<Integer> findLongestNumber(int[] numbers) {
        HashSet<Integer> result = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int lengthLongestNumber = findLongestLength(numbers);
            if ((numbers[i] + "").length() == lengthLongestNumber) {
                result.add(numbers[i]);
            }
        }
        return result;
    }

    public int findShotestLength(int[] numbers) {
        int shotestLength = Integer.toString(numbers[0]).length();
        for (int i = 1; i < numbers.length; i++) {
            if (shotestLength > Integer.toString(numbers[i]).length()) {
                shotestLength = Integer.toString(numbers[i]).length();
            }
        }
        return shotestLength;
    }

    public int findLongestLength(int[] numbers) {
        int longestLength = Integer.toString(numbers[0]).length();
        for (int i = 1; i < numbers.length; i++) {
            if (longestLength < Integer.toString(numbers[i]).length()) {
                longestLength = Integer.toString(numbers[i]).length();
            }
        }
        return longestLength;
    }

    public void printSet(Set numbers) {
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public void printNumbersInAscendingOrder(int[] sourceNumbers) {
        int[] numbers = Arrays.copyOf(sourceNumbers, sourceNumbers.length);
        Arrays.sort(numbers);
        System.out.print("Числа в порядке возростания значения их длины: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public double findAverageLength(int[] numbers) {
        int sumAllNumbersLength = 0;
        double averageLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumAllNumbersLength = sumAllNumbersLength + Integer.toString(numbers[i]).length();
        }
        averageLength = sumAllNumbersLength / numbers.length;
        return averageLength;
    }

    public HashSet<Integer> findNumbersWithLengthBelowTheAverageNumbersLength(int[] numbers) {
        HashSet<Integer> numbersBelowTheAverageLength = new HashSet<Integer>();
        double averageLength = findAverageLength(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (Integer.toString(numbers[i]).length() < averageLength) {
                numbersBelowTheAverageLength.add(numbers[i]);
            }
        }
        return numbersBelowTheAverageLength;
    }

    public int findNumberWithDigitsInAscedingOrder(int[] numbers) {
        int numberWithIncresingDigit = 0;
        boolean b = true;
        for (int i = 0; i < numbers.length; i++) {
            if (Integer.toString(numbers[i]).length() > 1) {
                int number = numbers[i];
                while (number != 0) {
                    int digit = number % 10;
                    number = number / 10;
                    if (digit > number % 10) {
                        b = true;
                    } else {
                        b = false;
                        break;
                    }
                }
                if (b == true) {
                    numberWithIncresingDigit = numbers[i];
                    break;
                }
            }
        }
        return numberWithIncresingDigit;
    }

    public void findNumberContiningOnlyDifferentDigits(int[] sourceNumbers) {
        int countNumbersContiningOnlyDifferentDigits = 0;
        for (int i = 0; i < sourceNumbers.length; i++) {
            Map<Integer, Integer> numbers = new HashMap<>();
            int number = sourceNumbers[i];
            while (number != 0) {
                int digit = number % 10;
                if (numbers.containsKey(digit)) {
                    numbers.clear();
                    break;
                } else {
                    numbers.put(digit, 1);
                }
                number = number / 10;
            }
            if (!(numbers.size() == 1) & !(numbers.isEmpty())) {
                System.out.println("Первое число, состоящие из различных цифр " + sourceNumbers[i]);
                countNumbersContiningOnlyDifferentDigits += 1;
                break;
            }
        }
        if (countNumbersContiningOnlyDifferentDigits == 0) {
            System.out.println("Числа, состоящего только из различных цифр нет.");
        }
    }

    public int findQuantityNumbersContiningOnlyEvenDigits(int[] sourceNumbers) {
        int counterNumbersContiningOnlyEvenDigits = 0;
        for (int i = 0; i < sourceNumbers.length; i++) {
            boolean isEvenDigit = true;
            int number = sourceNumbers[i];
            while (number != 0) {
                int digit = number % 10;
                if (digit % 2 != 0) {
                    isEvenDigit = false;
                    break;
                } else {
                    number = number / 10;
                }
            }
            if (isEvenDigit) {
                counterNumbersContiningOnlyEvenDigits += 1;
            }
        }
        return counterNumbersContiningOnlyEvenDigits;
    }

    public int findQuantityNumbersContiningEqualNumberEvenAndUnevenDigits(int[] sourceNumbers) {
        int quantityNumbersContiningEqualNumberEvenAndUnevenDigits = 0;
        for (int i = 0; i < sourceNumbers.length; i++) {
            int quantityEvenDigits = 0;
            int quantityUnevenDigits = 0;
            int number = sourceNumbers[i];
            while (number != 0) {
                int digit = number % 10;
                if (digit % 2 != 0) {
                    quantityUnevenDigits += 1;
                } else {
                    quantityEvenDigits += 1;
                }
                number = number / 10;
            }
            int differenceBetweenQuantityEvenDigitsAndUnevenDigits = quantityEvenDigits - quantityUnevenDigits;
            if (differenceBetweenQuantityEvenDigitsAndUnevenDigits == 0) {
                quantityNumbersContiningEqualNumberEvenAndUnevenDigits += 1;
            }
        }
        return quantityNumbersContiningEqualNumberEvenAndUnevenDigits;
    }


    public void findShotestNumberNew(int[] numbers) {
        HashSet<Integer> result = new HashSet<>();
        int shotestNumberLength = Integer.toString(numbers[0]).length();
        for (int i = 0; i < numbers.length; i++) {
            if (shotestNumberLength > Integer.toString(numbers[i]).length()) {
                if (!result.isEmpty()) {
                    result.clear();
                }
                shotestNumberLength = Integer.toString(numbers[i]).length();
                result.add(numbers[i]);
            } else if (shotestNumberLength == Integer.toString(numbers[i]).length()) {
                result.add(numbers[i]);
            }
        }
        System.out.println("Shotest numbers length = " + shotestNumberLength);
        System.out.print("Shotest numbers: ");
        printSet(result);
        System.out.println("");
    }
}
