package Sorting.SelectionSort;

import java.util.Arrays;

public class example1 {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 6, 7, 4, 8 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = findMax(arr, 0, lastIndex);
            swap(arr, lastIndex, maxIndex);
        }
    }

    static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
