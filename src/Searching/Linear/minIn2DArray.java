package Searching.Linear;

public class minIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                { 28, 22, 11, 45, 10 },
                { 24, 12, 3 },
                { 56, 1, 67, 99 },
                { 89, 5 }
        };

        System.out.println(min(array));
    }

    static int min(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
