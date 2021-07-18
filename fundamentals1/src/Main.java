import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число - как много переменных вы хотите добавить в массив и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int massiveSize = scan.nextInt();
        int numbers[] = new int[massiveSize];
        System.out.println();
        System.out.println("Введите числа через пробел и нажмите <Enter>:");
        for (int i = 0; i < massiveSize; i++) {
            numbers[i] = scan.nextInt();
        }

        Utils utils = new Utils();

        //1 Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        System.out.print("Самыое короткое число/числа: " );
        utils.printSet(utils.findShotestNumber(numbers));
        System.out.println("Длина = " + utils.findShotestLength(numbers));
        System.out.print("Самое длинное число/числа: ");
        utils.printSet(utils.findLongestNumber(numbers));
        System.out.println("Длина = " + utils.findLongestLength(numbers));

//        utils.findShotestNumberNew(numbers);

        //2 Вывести числа в порядке возрастания значений их длины.
        utils.printNumbersInAscendingOrder(numbers);
        System.out.println();

        //3 Вывести на консоль те числа, длина которых меньше средней длины по всем числам, а также длину.
        System.out.print("Число/числа с длинной меньше средней: " );
        utils.printSet(utils.findNumbersWithLengthBelowTheAverageNumbersLength(numbers));
        System.out.println();
        System.out.println("Средняя длина " + utils.findAverageLength(numbers));
        System.out.println();

        //4 Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        System.out.print("Первое число с цифрами по возрастанию: " );
       int numberWithIncresinDigits = utils.findNumberWithDigitsInAscedingOrder(numbers);
        System.out.println(numberWithIncresinDigits);
        System.out.println("");

        //5 Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
        utils.findNumberContiningOnlyDifferentDigits(numbers);


        // 6 Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр
        System.out.println("Количество чисел с только четными цифрами: " + utils.findQuantityNumbersContiningOnlyEvenDigits(numbers));
        System.out.println("Количество чисел с равным числом четных и нечетных чисел: " + utils.findQuantityNumbersContiningEqualNumberEvenAndUnevenDigits(numbers));
    }
}