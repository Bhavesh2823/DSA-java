package Sorting.BubbleSort;

import java.util.Arrays;

public class example1 {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 1, 8, 0, 5 };
        System.out.println(Arrays.toString(bubblesort(arr)));
    }

    static int[] bubblesort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
