public class Utils {
    public int[][] reversedLine(int[][] array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[a][i];
            array[a][i] = array[b][i];
            array[b][i] = temp;
        }
        return array;
    }

    public int[][] sortArrayByColumn(int[][] array, int columnNumber) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i][columnNumber] > array[i + 1][columnNumber]) {
                array = reversedLine(array,i,i+1);
            }
        }
        return array;
    }
    public void printArray (int [][]array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
