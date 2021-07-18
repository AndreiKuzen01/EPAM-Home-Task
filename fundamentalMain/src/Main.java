import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println("Введите ваше имя");
        Scanner scaner = new Scanner(System.in);
        String name = scaner.next();
        System.out.println("Hello " + name);

        // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        System.out.println("Введите аргументы через пробел");
        Scanner sc = new Scanner(System.in);
        String arguments = sc.nextLine();
        String[] array = arguments.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        // 3. Вывести заданное количество случайных чисел с переходом и без перехода н новую строку.
        System.out.println();
        System.out.println("Введите количество сучайных чисел");
        int min = 0;
        int max = 100;
        int quantity = scaner.nextInt();
        System.out.println("Вывод с переходом:");
        for (int i = 1; i <= quantity; i++) {
            System.out.println(min + (int) (Math.random() * 100));
        }
        System.out.println("Вывод без перехода:");
        for (int i = 1; i <= quantity; i++) {
            System.out.print(min + (int) (Math.random() * 100) + " ");
        }

        // 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму(произведение)
        // и вывести результат на консоль.
        System.out.println();
        int sum = 0;
        int com = 1;
        System.out.println("Введите целые числа через пробел");
        String [] numbersArray = sc.nextLine().split(" ");
        for(int i = 0; i < numbersArray.length; i++){
            sum = sum + Integer.parseInt(numbersArray[i]);
            com = com * Integer.parseInt(numbersArray[i]);
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + com);

        //5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
        // Осуществить проверку корректности ввода чисел.
        String [] mounths = new String[12];
        mounths[0] = "Январь";
        mounths[1] = "Февраль";
        mounths[2] = "Март";
        mounths[3] = "Апрель";
        mounths[4] = "Май";
        mounths[5] = "Июнь";
        mounths[6] = "Июль";
        mounths[7] = "Август";
        mounths[8] = "Сентябрь";
        mounths[9] = "Октябрь";
        mounths[10] = "Ноябрь";
        mounths[11] = "Декабрь";
        System.out.println("Введите номер месяца");
        try {
            System.out.println(mounths[sc.nextInt()-1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Месяца с таким номером не существует");
        }catch (InputMismatchException e){
            System.out.println("Некорректно введены данные");
        }
    }
}
