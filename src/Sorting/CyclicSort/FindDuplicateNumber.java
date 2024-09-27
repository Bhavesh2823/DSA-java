package Sorting.CyclicSort;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        int ans = cyclicSort(arr);
        System.out.println(ans);
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
