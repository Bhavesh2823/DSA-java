package Sorting.CyclicSort;

import java.util.Arrays;

import com.kunal.swap;

public class MissingValue {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 4, 0 };
        int ans = cyclicSort(arr);
        System.out.println(ans);
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        // checking for first missing value
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
