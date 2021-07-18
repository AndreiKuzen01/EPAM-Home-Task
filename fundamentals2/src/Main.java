import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println("Введите минимальную границу рандома: ");
        int minNumber = scan.nextInt();
        System.out.println("Ведите максимальную границу рандома: ");
        int maxNumber = scan.nextInt();
        System.out.println("Ваша матрица: ");
        int [][] array = new int [m][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                array [i][j] = minNumber + (int) (Math.random()*((maxNumber - minNumber)+1));
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Введите номер столбца: ");
        int columnNumber = scan.nextInt();
        Utils util = new Utils();
        util.sortArrayByColumn(array, columnNumber);
        util.printArray(array);
    }
}
