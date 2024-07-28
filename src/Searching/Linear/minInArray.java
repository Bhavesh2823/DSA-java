package Searching.Linear;

public class minInArray {
    public static void main(String[] args) {
        int[] array = { 9, 5, 3, 6, 2, 1, 8, 7 };
        System.out.println(min(array));
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
